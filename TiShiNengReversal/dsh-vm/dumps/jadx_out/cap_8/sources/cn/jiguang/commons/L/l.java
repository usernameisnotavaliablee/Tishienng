package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class l {
    private static final java.lang.String[] a = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f896c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f897d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String[] f898e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String[] f899f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String[] f900g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final cn.jiguang.commons.L.l.a[] f901h = null;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f902i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f903j;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f904k;
    private static boolean l;
    private static final java.util.List m = null;

    private static class a {
        public final java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f905b;

        public a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f905b = r2
                return
        }
    }

    static {
            java.lang.String r0 = "/dev/socket/genyd"
            java.lang.String r1 = "/dev/socket/baseband_genyd"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            cn.jiguang.commons.L.l.a = r0
            java.lang.String r0 = "fstab.andy"
            java.lang.String r1 = "ueventd.andy.rc"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            cn.jiguang.commons.L.l.f896c = r0
            java.lang.String r0 = "init.nox.rc"
            java.lang.String r1 = "ueventd.nox.rc"
            java.lang.String r2 = "fstab.nox"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            cn.jiguang.commons.L.l.f897d = r0
            java.lang.String r0 = "/dev/socket/qemud"
            java.lang.String r1 = "/dev/qemu_pipe"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            cn.jiguang.commons.L.l.f898e = r0
            java.lang.String r7 = "init.vbox86.rc"
            java.lang.String r8 = "ueventd.vbox86.rc"
            java.lang.String r1 = "ueventd.android_x86.rc"
            java.lang.String r2 = "x86.prop"
            java.lang.String r3 = "ueventd.ttVM_x86.rc"
            java.lang.String r4 = "init.ttVM_x86.rc"
            java.lang.String r5 = "fstab.ttVM_x86"
            java.lang.String r6 = "fstab.vbox86"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            cn.jiguang.commons.L.l.f899f = r0
            java.lang.String r0 = "goldfish"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            cn.jiguang.commons.L.l.f900g = r1
            cn.jiguang.commons.L.l$a r1 = new cn.jiguang.commons.L.l$a
            java.lang.String r2 = "init.svc.qemud"
            r3 = 0
            r1.<init>(r2, r3)
            cn.jiguang.commons.L.l$a r2 = new cn.jiguang.commons.L.l$a
            java.lang.String r4 = "init.svc.qemu-props"
            r2.<init>(r4, r3)
            cn.jiguang.commons.L.l$a r4 = new cn.jiguang.commons.L.l$a
            java.lang.String r5 = "qemu.hw.mainkeys"
            r4.<init>(r5, r3)
            cn.jiguang.commons.L.l$a r5 = new cn.jiguang.commons.L.l$a
            java.lang.String r6 = "qemu.sf.fake_camera"
            r5.<init>(r6, r3)
            cn.jiguang.commons.L.l$a r6 = new cn.jiguang.commons.L.l$a
            java.lang.String r7 = "qemu.sf.lcd_density"
            r6.<init>(r7, r3)
            cn.jiguang.commons.L.l$a r7 = new cn.jiguang.commons.L.l$a
            java.lang.String r8 = "ro.bootloader"
            java.lang.String r9 = "unknown"
            r7.<init>(r8, r9)
            cn.jiguang.commons.L.l$a r8 = new cn.jiguang.commons.L.l$a
            java.lang.String r10 = "ro.bootmode"
            r8.<init>(r10, r9)
            cn.jiguang.commons.L.l$a r9 = new cn.jiguang.commons.L.l$a
            java.lang.String r10 = "ro.hardware"
            r9.<init>(r10, r0)
            cn.jiguang.commons.L.l$a r0 = new cn.jiguang.commons.L.l$a
            java.lang.String r10 = "ro.kernel.android.qemud"
            r0.<init>(r10, r3)
            cn.jiguang.commons.L.l$a r10 = new cn.jiguang.commons.L.l$a
            java.lang.String r11 = "ro.kernel.qemu.gles"
            r10.<init>(r11, r3)
            cn.jiguang.commons.L.l$a r3 = new cn.jiguang.commons.L.l$a
            java.lang.String r11 = "ro.kernel.qemu"
            java.lang.String r12 = "1"
            r3.<init>(r11, r12)
            cn.jiguang.commons.L.l$a r11 = new cn.jiguang.commons.L.l$a
            java.lang.String r12 = "ro.product.device"
            java.lang.String r13 = "generic"
            r11.<init>(r12, r13)
            cn.jiguang.commons.L.l$a r12 = new cn.jiguang.commons.L.l$a
            java.lang.String r13 = "ro.product.model"
            java.lang.String r14 = "sdk"
            r12.<init>(r13, r14)
            cn.jiguang.commons.L.l$a r13 = new cn.jiguang.commons.L.l$a
            java.lang.String r15 = "ro.product.name"
            r13.<init>(r15, r14)
            r14 = 14
            cn.jiguang.commons.L.l$a[] r14 = new cn.jiguang.commons.L.l.a[r14]
            r15 = 0
            r14[r15] = r1
            r1 = 1
            r14[r1] = r2
            r2 = 2
            r14[r2] = r4
            r2 = 3
            r14[r2] = r5
            r2 = 4
            r14[r2] = r6
            r2 = 5
            r14[r2] = r7
            r2 = 6
            r14[r2] = r8
            r2 = 7
            r14[r2] = r9
            r2 = 8
            r14[r2] = r0
            r0 = 9
            r14[r0] = r10
            r0 = 10
            r14[r0] = r3
            r0 = 11
            r14[r0] = r11
            r0 = 12
            r14[r0] = r12
            r0 = 13
            r14[r0] = r13
            cn.jiguang.commons.L.l.f901h = r14
            cn.jiguang.commons.L.l.f902i = r15
            cn.jiguang.commons.L.l.f903j = r15
            cn.jiguang.commons.L.l.f904k = r1
            cn.jiguang.commons.L.l.l = r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.commons.L.l.m = r0
            java.lang.String r1 = "com.google.android.launcher.layouts.genymotion"
            r0.add(r1)
            java.lang.String r1 = "com.bluestacks"
            r0.add(r1)
            java.lang.String r1 = "com.bignox.app"
            r0.add(r1)
            return
    }

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    private static boolean a() {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "generic"
            boolean r0 = r0.startsWith(r1)
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()
            r3 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r2 = r2.d(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "google_sdk"
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L44
            if (r0 != 0) goto L43
            boolean r0 = r2.contains(r4)
            if (r0 != 0) goto L43
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r3 = "droid4x"
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L43
            java.lang.String r0 = "Emulator"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "Android SDK built for x86"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L41
            goto L43
        L41:
            r0 = 0
            goto L44
        L43:
            r0 = 1
        L44:
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()
            r3 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r2 = r2.d(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L62
            if (r0 != 0) goto L61
            java.lang.String r0 = "Genymotion"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5f
            goto L61
        L5f:
            r0 = 0
            goto L62
        L61:
            r0 = 1
        L62:
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()
            r3 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r2 = r2.d(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r7 = "nox"
            if (r3 != 0) goto La3
            if (r0 != 0) goto La2
            java.lang.String r0 = "sdk"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La2
            boolean r0 = r2.equals(r4)
            if (r0 != 0) goto La2
            java.lang.String r0 = "sdk_x86"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La2
            java.lang.String r0 = "vbox86p"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto La2
            java.lang.String r0 = r2.toLowerCase()
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto La0
            goto La2
        La0:
            r0 = 0
            goto La3
        La2:
            r0 = 1
        La3:
            if (r0 != 0) goto Ldd
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r3 = "goldfish"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Ldd
            java.lang.String r3 = "vbox86"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto Ldd
            java.lang.String r3 = android.os.Build.BOARD
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto Ldd
            java.lang.String r3 = android.os.Build.BOOTLOADER
            java.lang.String r3 = r3.toLowerCase()
            boolean r3 = r3.contains(r7)
            if (r3 != 0) goto Ldd
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto Ldb
            goto Ldd
        Ldb:
            r0 = 0
            goto Lde
        Ldd:
            r0 = 1
        Lde:
            if (r0 == 0) goto Le1
            return r6
        Le1:
            java.lang.String r3 = cn.jiguang.commons.L.j.g()
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto Lfb
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto Lfa
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto Lfa
            r5 = 1
        Lfa:
            r0 = r0 | r5
        Lfb:
            if (r0 == 0) goto Lfe
            return r6
        Lfe:
            boolean r1 = r4.equals(r2)
            r0 = r0 | r1
            return r0
    }

    private static boolean a(java.lang.String[] r5, java.lang.String r6) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L32
            r3 = r5[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Check "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = " detected"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "EmulatorDetector"
            cn.jiguang.commons.w.a.a(r6, r5)
            r5 = 1
            return r5
        L2f:
            int r2 = r2 + 1
            goto L3
        L32:
            return r1
    }

    private static boolean c() {
            java.lang.String r0 = "EmulatorDetector"
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = cn.jiguang.commons.L.u.a(r1)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r3 = 1
            java.lang.ProcessBuilder r4 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "/system/bin/netcfg"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L4c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "/system/bin/"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            r4.directory(r5)     // Catch: java.lang.Throwable -> L4c
            r4.redirectErrorStream(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.Process r4 = r4.start()     // Catch: java.lang.Throwable -> L4c
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L4c
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L46
        L36:
            int r6 = r4.read(r5)     // Catch: java.lang.Throwable -> L46
            r7 = -1
            if (r6 == r7) goto L48
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L46
            r7.<init>(r5, r2, r6)     // Catch: java.lang.Throwable -> L46
            r1.append(r7)     // Catch: java.lang.Throwable -> L46
            goto L36
        L46:
            r5 = move-exception
            goto L4e
        L48:
            r4.close()     // Catch: java.lang.Throwable -> L4c
            goto L60
        L4c:
            r4 = move-exception
            goto L59
        L4e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L4c
        L58:
            throw r5     // Catch: java.lang.Throwable -> L4c
        L59:
            java.lang.String r4 = r4.getMessage()
            cn.jiguang.commons.w.a.a(r0, r4)
        L60:
            java.lang.String r1 = r1.toString()
            boolean r4 = cn.jiguang.commons.L.l.f902i
            if (r4 == 0) goto L7c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "netcfg data -> "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            cn.jiguang.commons.w.a.a(r0, r4)
        L7c:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto Lb8
            java.lang.String r4 = "\n"
            java.lang.String[] r1 = r1.split(r4)
            int r4 = r1.length
            r5 = 0
        L8a:
            if (r5 >= r4) goto Lb8
            r6 = r1[r5]
            java.lang.String r7 = "wlan0"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto La7
            java.lang.String r7 = "tunl0"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto La7
            java.lang.String r7 = "eth0"
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto Lb5
        La7:
            java.lang.String r7 = "10.0.2.15"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto Lb5
            java.lang.String r1 = "Check IP is detected"
            cn.jiguang.commons.w.a.a(r0, r1)
            return r3
        Lb5:
            int r5 = r5 + 1
            goto L8a
        Lb8:
            return r2
    }

    public static boolean d() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r1 = 0
            java.lang.String r2 = "EmulatorDetector"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Context is null, cannot check light sensor"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
        Lf:
            java.lang.String r3 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r3 = 5
            android.hardware.Sensor r0 = r0.getDefaultSensor(r3)
            if (r0 != 0) goto L25
            java.lang.String r0 = "Light sensor not found, likely emulator"
            cn.jiguang.commons.w.a.a(r2, r0)
            r0 = 1
            return r0
        L25:
            return r1
    }

    private static boolean e() {
            boolean r0 = cn.jiguang.commons.L.u.n()
            if (r0 == 0) goto L21
            boolean r0 = j()
            if (r0 == 0) goto L21
            java.lang.String r0 = cn.jiguang.commons.L.ae.j()
            java.lang.String r1 = "android"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L21
            java.lang.String r0 = "EmulatorDetector"
            java.lang.String r1 = "Check operator name android detected"
            cn.jiguang.commons.w.a.a(r0, r1)
            r0 = 1
            return r0
        L21:
            r0 = 0
            return r0
    }

    private static boolean f() {
            boolean r0 = cn.jiguang.commons.L.l.f903j
            r1 = 0
            if (r0 == 0) goto L76
            java.util.List r0 = cn.jiguang.commons.L.l.m
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            goto L76
        Le:
            android.content.Context r2 = cn.jiguang.commons.L.h.a()
            java.lang.String r3 = "EmulatorDetector"
            if (r2 != 0) goto L1c
            java.lang.String r0 = "Context null, cannot check package names"
            cn.jiguang.commons.w.a.f(r3, r0)
            return r1
        L1c:
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            android.content.Intent r5 = r2.getLaunchIntentForPackage(r4)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L24
            r6 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r5 = r2.resolveActivity(r5, r6)     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r5.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "Emulator package found: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L54
            r5.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L54
            cn.jiguang.commons.w.a.a(r3, r5)     // Catch: java.lang.Throwable -> L54
            r0 = 1
            return r0
        L54:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Error checking package "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ": "
            r6.append(r4)
            java.lang.String r4 = r5.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            cn.jiguang.commons.w.a.f(r3, r4)
            goto L24
        L76:
            return r1
    }

    private static boolean g() {
            r0 = 0
            return r0
    }

    private static boolean h() {
            cn.jiguang.commons.L.l$a[] r0 = cn.jiguang.commons.L.l.f901h
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = 0
        L6:
            if (r3 >= r1) goto L3c
            r5 = r0[r3]
            java.lang.String r6 = r5.a
            java.lang.String r7 = "ro.product.name"
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L39
            java.lang.String r6 = r5.a
            java.lang.String r7 = "ro.product.model"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L1f
            goto L39
        L1f:
            java.lang.String r6 = r5.a
            java.lang.String r7 = ""
            java.lang.String r6 = cn.jiguang.commons.L.ad.a(r6, r7)
            java.lang.String r5 = r5.f905b
            if (r5 != 0) goto L2d
            if (r6 != 0) goto L37
        L2d:
            if (r5 == 0) goto L39
            if (r6 == 0) goto L39
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L39
        L37:
            int r4 = r4 + 1
        L39:
            int r3 = r3 + 1
            goto L6
        L3c:
            r0 = 5
            if (r4 < r0) goto L48
            java.lang.String r0 = "EmulatorDetector"
            java.lang.String r1 = "Check QEmuProps detected"
            cn.jiguang.commons.w.a.a(r0, r1)
            r0 = 1
            return r0
        L48:
            return r2
    }

    private static boolean i() {
            boolean r0 = a()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L45
            boolean r0 = e()
            if (r0 != 0) goto L45
            java.lang.String[] r0 = cn.jiguang.commons.L.l.a
            java.lang.String r3 = "Geny"
            boolean r0 = a(r0, r3)
            if (r0 != 0) goto L45
            java.lang.String[] r0 = cn.jiguang.commons.L.l.f896c
            java.lang.String r3 = "Andy"
            boolean r0 = a(r0, r3)
            if (r0 != 0) goto L45
            java.lang.String[] r0 = cn.jiguang.commons.L.l.f897d
            java.lang.String r3 = "Nox"
            boolean r0 = a(r0, r3)
            if (r0 != 0) goto L45
            java.lang.String[] r0 = cn.jiguang.commons.L.l.f898e
            java.lang.String r3 = "Pipes"
            boolean r0 = a(r0, r3)
            if (r0 != 0) goto L45
            boolean r0 = g()
            if (r0 != 0) goto L45
            boolean r0 = c()
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            if (r0 != 0) goto L76
            boolean r3 = cn.jiguang.commons.L.l.f904k
            if (r3 == 0) goto L5f
            boolean r0 = h()
            if (r0 == 0) goto L5d
            java.lang.String[] r0 = cn.jiguang.commons.L.l.f899f
            java.lang.String r3 = "X86"
            boolean r0 = a(r0, r3)
            if (r0 == 0) goto L5d
            goto L60
        L5d:
            r1 = 0
            goto L60
        L5f:
            r1 = r0
        L60:
            boolean r0 = cn.jiguang.commons.L.l.f903j
            if (r0 == 0) goto L6a
            if (r1 != 0) goto L6a
            boolean r1 = f()
        L6a:
            boolean r0 = cn.jiguang.commons.L.l.l
            if (r0 == 0) goto L75
            if (r1 != 0) goto L75
            boolean r0 = d()
            return r0
        L75:
            return r1
        L76:
            return r0
    }

    private static boolean j() {
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            java.lang.String r1 = "EmulatorDetector"
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Context is null, cannot check telephony support"
            cn.jiguang.commons.w.a.f(r1, r0)
            r0 = 0
            return r0
        Lf:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r2 = "android.hardware.telephony"
            boolean r0 = r0.hasSystemFeature(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Supported TelePhony: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r1, r2)
            return r0
    }

    public static boolean k() {
            java.lang.String r0 = "EmulatorDetector"
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = i()     // Catch: java.lang.Throwable -> L33
            boolean r4 = cn.jiguang.commons.L.l.f902i     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r4.<init>()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = "sync detect cost time: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            long r5 = r5 - r1
            r4.append(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = ", isSimulator: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L30
            r4.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L30
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Throwable -> L30
            return r3
        L30:
            r1 = move-exception
            goto L35
        L32:
            return r3
        L33:
            r1 = move-exception
            r3 = 0
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "detect failed, error: "
            r2.append(r4)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.f(r0, r1)
            return r3
    }
}
