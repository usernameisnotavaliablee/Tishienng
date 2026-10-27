package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bl {
    public bl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String A() {
            java.lang.String r0 = "persist.service.bdroid.bdaddr"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String B() {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L29
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "gsm.version.baseband"
            r2[r5] = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L28
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        L28:
            return r0
        L29:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String C() {
            int r0 = android.hardware.Camera.getNumberOfCameras()     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            r1.append(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String D() {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> L28
            java.io.File r1 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L28
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            long r0 = r0.getTotalBytes()     // Catch: java.lang.Throwable -> L28
            r2 = 20
            long r0 = r0 >> r2
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L28
            r1 = 1149239296(0x44800000, float:1024.0)
            float r0 = r0 / r1
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L28
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)     // Catch: java.lang.Throwable -> L28
            r1 = 2
            r2 = 4
            java.math.BigDecimal r0 = r0.setScale(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            return r0
        L28:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String E() {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> L28
            java.io.File r1 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L28
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L28
            long r0 = r0.getAvailableBytes()     // Catch: java.lang.Throwable -> L28
            r2 = 20
            long r0 = r0 >> r2
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L28
            r1 = 1149239296(0x44800000, float:1024.0)
            float r0 = r0 / r1
            double r0 = (double) r0     // Catch: java.lang.Throwable -> L28
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)     // Catch: java.lang.Throwable -> L28
            r1 = 2
            r2 = 4
            java.math.BigDecimal r0 = r0.setScale(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L28
            return r0
        L28:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String F() {
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String G() {
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static long H() {
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L37
        Le:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            java.lang.String r2 = "MemTotal"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto Le
            java.lang.String r2 = "\\s+"
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L31
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L31
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L31
            r1.close()     // Catch: java.io.IOException -> L30
        L30:
            return r2
        L31:
            goto L38
        L33:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L3b
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L3b
            goto L33
        L3b:
            r0 = 0
            return r0
    }

    public static java.lang.String I() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "/system/bin/app_process"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = com.kuaishou.weapon.p0.f.a(r0)     // Catch: java.lang.Throwable -> Lc
            return r0
        Lc:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String J() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "/system/bin/servicemanager"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            boolean r1 = r0.canRead()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            java.lang.String r0 = com.kuaishou.weapon.p0.f.a(r0)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String K() {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "/system/framework/framework.jar"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            boolean r1 = r0.canRead()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L18
            java.lang.String r0 = com.kuaishou.weapon.p0.f.a(r0)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String L() {
            java.lang.String r0 = android.os.Build.getRadioVersion()
            return r0
    }

    private static float a(android.util.DisplayMetrics r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            float r1 = r1.xdpi     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            return r0
    }

    public static int a(android.content.Context r1) {
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L11
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lc
            r1 = -1
            return r1
        Lc:
            int r1 = r1.getPhoneType()     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = -2
            return r1
    }

    public static java.lang.String a() {
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    private static float b(android.util.DisplayMetrics r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            float r1 = r1.ydpi     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch: java.lang.Throwable -> L5
            goto Lb
        L5:
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L14
        Lb:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L13
            java.lang.String r1 = "RISK_GET_FIELD_EMPTY"
        L13:
            return r1
        L14:
            java.lang.String r1 = "RISK_EXCEPTION_HAPPEN"
            return r1
    }

    public static java.lang.String c() {
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String c(android.content.Context r6) {
            java.lang.String r0 = ""
            java.lang.String r1 = "window"
            java.lang.Object r1 = r6.getSystemService(r1)     // Catch: java.lang.Throwable -> La0
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> La0
            android.view.Display r2 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> La0
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> La0
            r3.<init>()     // Catch: java.lang.Throwable -> La0
            r2.getMetrics(r3)     // Catch: java.lang.Throwable -> La0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La0
            r4 = 31
            if (r3 < r4) goto L31
            android.view.WindowMetrics r1 = com.kuaishou.weapon.p0.c0.a(r1)     // Catch: java.lang.Throwable -> La0
            android.graphics.Rect r2 = com.bytedance.sdk.openadsdk.core.rn.d.a(r1)     // Catch: java.lang.Throwable -> La0
            int r2 = r2.width()     // Catch: java.lang.Throwable -> La0
            android.graphics.Rect r1 = com.bytedance.sdk.openadsdk.core.rn.d.a(r1)     // Catch: java.lang.Throwable -> La0
            int r1 = r1.height()     // Catch: java.lang.Throwable -> La0
            goto L3d
        L31:
            android.graphics.Point r1 = new android.graphics.Point     // Catch: java.lang.Throwable -> La0
            r1.<init>()     // Catch: java.lang.Throwable -> La0
            r2.getRealSize(r1)     // Catch: java.lang.Throwable -> La0
            int r2 = r1.x     // Catch: java.lang.Throwable -> La0
            int r1 = r1.y     // Catch: java.lang.Throwable -> La0
        L3d:
            android.util.DisplayMetrics r3 = j(r6)     // Catch: java.lang.Throwable -> La0
            float r3 = a(r3)     // Catch: java.lang.Throwable -> La0
            android.util.DisplayMetrics r6 = j(r6)     // Catch: java.lang.Throwable -> La0
            float r6 = b(r6)     // Catch: java.lang.Throwable -> La0
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto La0
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 != 0) goto L57
            goto La0
        L57:
            float r2 = (float) r2     // Catch: java.lang.Throwable -> La0
            float r2 = r2 / r3
            r3 = 1076006748(0x40228f5c, float:2.54)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> La0
            int r2 = r2 * 10
            float r1 = (float) r1     // Catch: java.lang.Throwable -> La0
            float r1 = r1 / r6
            float r1 = r1 * r3
            int r6 = java.lang.Math.round(r1)     // Catch: java.lang.Throwable -> La0
            int r6 = r6 * 10
            java.lang.String r1 = "mm"
            java.lang.String r3 = "mm * "
            if (r2 <= r6) goto L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            r4.append(r6)     // Catch: java.lang.Throwable -> La0
            r4.append(r3)     // Catch: java.lang.Throwable -> La0
            r4.append(r2)     // Catch: java.lang.Throwable -> La0
            r4.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> La0
            return r6
        L8a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r4.<init>()     // Catch: java.lang.Throwable -> La0
            r4.append(r2)     // Catch: java.lang.Throwable -> La0
            r4.append(r3)     // Catch: java.lang.Throwable -> La0
            r4.append(r6)     // Catch: java.lang.Throwable -> La0
            r4.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> La0
            return r6
        La0:
            return r0
    }

    public static java.lang.String d() {
            java.lang.String r0 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String d(android.content.Context r3) {
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L65
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch: java.lang.Throwable -> L65
            android.view.Display r0 = r3.getDefaultDisplay()     // Catch: java.lang.Throwable -> L65
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r0.getMetrics(r1)     // Catch: java.lang.Throwable -> L65
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L65
            r2 = 31
            if (r1 < r2) goto L2f
            android.view.WindowMetrics r3 = com.kuaishou.weapon.p0.c0.a(r3)     // Catch: java.lang.Throwable -> L65
            android.graphics.Rect r0 = com.bytedance.sdk.openadsdk.core.rn.d.a(r3)     // Catch: java.lang.Throwable -> L65
            int r0 = r0.width()     // Catch: java.lang.Throwable -> L65
            android.graphics.Rect r3 = com.bytedance.sdk.openadsdk.core.rn.d.a(r3)     // Catch: java.lang.Throwable -> L65
            int r3 = r3.height()     // Catch: java.lang.Throwable -> L65
            goto L3b
        L2f:
            android.graphics.Point r3 = new android.graphics.Point     // Catch: java.lang.Throwable -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L65
            r0.getRealSize(r3)     // Catch: java.lang.Throwable -> L65
            int r0 = r3.x     // Catch: java.lang.Throwable -> L65
            int r3 = r3.y     // Catch: java.lang.Throwable -> L65
        L3b:
            java.lang.String r1 = "*"
            if (r0 <= r3) goto L52
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            r2.append(r3)     // Catch: java.lang.Throwable -> L65
            r2.append(r1)     // Catch: java.lang.Throwable -> L65
            r2.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L65
            return r3
        L52:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            r2.append(r0)     // Catch: java.lang.Throwable -> L65
            r2.append(r1)     // Catch: java.lang.Throwable -> L65
            r2.append(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L65
            return r3
        L65:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String e() {
            java.lang.String r0 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String e(android.content.Context r0) {
            android.util.DisplayMetrics r0 = j(r0)
            if (r0 == 0) goto Ld
            int r0 = r0.densityDpi
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static java.lang.String f() {
            java.lang.String r0 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String f(android.content.Context r7) {
            r7 = 0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "cat /proc/version"
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r1 = r0.getInputStream()     // Catch: java.lang.Throwable -> L61
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L49
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "RISK_GET_FIELD_EMPTY"
            if (r3 > 0) goto L22
            r1.close()     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0.destroy()
            return r4
        L22:
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L49
            r6 = 0
            java.lang.System.arraycopy(r2, r6, r5, r6, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "utf-8"
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = "version"
            int r3 = r2.indexOf(r3)     // Catch: java.lang.Throwable -> L49
            r5 = -1
            if (r3 == r5) goto L4b
            java.lang.String r2 = r2.substring(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch: java.lang.Throwable -> L49
            int r3 = r2.length     // Catch: java.lang.Throwable -> L49
            r5 = 1
            if (r5 >= r3) goto L4b
            r7 = r2[r5]     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            goto L5f
        L4b:
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L58
            r1.close()     // Catch: java.lang.Throwable -> L54
        L54:
            r0.destroy()
            return r4
        L58:
            r1.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0.destroy()
            return r7
        L5f:
            r7 = r1
            goto L65
        L61:
            goto L65
        L63:
            r0 = r7
        L65:
            if (r7 == 0) goto L6c
            r7.close()     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
        L6c:
            if (r0 == 0) goto L71
            r0.destroy()
        L71:
            java.lang.String r7 = "RISK_EXCEPTION_HAPPEN"
            return r7
    }

    public static int g(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = "screen_off_timeout"
            int r1 = android.provider.Settings.System.getInt(r1, r0)     // Catch: java.lang.Exception -> Lb
            return r1
        Lb:
            r1 = -2
            return r1
    }

    public static java.lang.String g() {
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static int h(android.content.Context r1) {
            java.lang.String r0 = "audio"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> Ld
            android.media.AudioManager r1 = (android.media.AudioManager) r1     // Catch: java.lang.Exception -> Ld
            int r1 = r1.getRingerMode()     // Catch: java.lang.Exception -> Ld
            return r1
        Ld:
            r1 = -2
            return r1
    }

    public static java.lang.String h() {
            java.lang.String r0 = android.os.Build.HOST     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static int i(android.content.Context r4) {
            java.lang.Class<android.net.ConnectivityManager> r0 = android.net.ConnectivityManager.class
            java.lang.String r1 = "getMobileDataEnabled"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r3)     // Catch: java.lang.Throwable -> L24
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Throwable -> L24
            java.lang.Object r4 = r0.invoke(r4, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L24
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L23
            r4 = 0
            return r4
        L23:
            return r1
        L24:
            r4 = -2
            return r4
    }

    public static java.lang.String i() {
            java.lang.String r0 = android.os.Build.USER     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    private static android.util.DisplayMetrics j(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L15
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L15
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L15
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            r1.getMetrics(r0)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r1 = 0
            return r1
    }

    public static java.lang.String j() {
            java.lang.String r0 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String k() {
            java.lang.String r0 = android.os.Build.TAGS     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String l() {
            java.lang.String r0 = android.os.Build.BOOTLOADER     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = android.os.Build.ID     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String n() {
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String o() {
            java.lang.String r0 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String p() {
            java.lang.String r0 = "rild.libpath"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String q() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static int r() {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            r0 = -2
            return r0
    }

    public static java.lang.String s() {
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String t() {
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String u() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L41
            int r2 = r1.waitFor()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L16
            goto L1c
        L16:
            goto L3f
        L18:
            java.io.InputStream r2 = r1.getErrorStream()     // Catch: java.lang.Throwable -> L16
        L1c:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            r5 = 512(0x200, float:7.17E-43)
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L3a
            r3.close()     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
        L31:
            if (r2 == 0) goto L36
            r2.close()     // Catch: java.lang.Throwable -> L36
        L36:
            r1.destroy()
            return r0
        L3a:
            r0 = r3
            goto L44
        L3d:
            goto L44
        L3f:
            r2 = r0
            goto L44
        L41:
            r1 = r0
            r2 = r1
        L44:
            if (r0 == 0) goto L4b
            r0.close()     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L4a:
        L4b:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
        L52:
            if (r1 == 0) goto L57
            r1.destroy()
        L57:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String v() {
            java.lang.String r0 = android.os.Build.RADIO     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String w() {
            java.lang.String r0 = "ro.build.description"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String x() {
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto La
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        La:
            return r0
        Lb:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String y() {
            java.lang.String r0 = "ro.product.name"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }

    public static java.lang.String z() {
            java.lang.String r0 = "dalvik.vm.heapgrowthlimit"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Le
            java.lang.String r0 = "RISK_GET_FIELD_EMPTY"
        Le:
            return r0
        Lf:
            java.lang.String r0 = "RISK_EXCEPTION_HAPPEN"
            return r0
    }
}
