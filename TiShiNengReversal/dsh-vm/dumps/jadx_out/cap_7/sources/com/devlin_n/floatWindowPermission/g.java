package com.devlin_n.floatWindowPermission;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g {
    private static final java.lang.String a = "RomUtils";

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "QiKU"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "360"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean b() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static boolean c() {
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r0 = g(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.String r1 = "flyme"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L22
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            goto L22
        L21:
            return r2
        L22:
            r0 = 1
            return r0
    }

    public static boolean d() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = g(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static double e() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = g(r0)     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "_"
            int r1 = r0.indexOf(r1)     // Catch: java.lang.Exception -> L17
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L17
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Exception -> L17
            return r0
        L17:
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            return r0
    }

    public static int f() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = g(r0)
            if (r0 == 0) goto L12
            r1 = 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L12
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            r0 = -1
            return r0
    }

    public static java.lang.String g(java.lang.String r4) {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r2.append(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.Process r4 = r1.exec(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            r1.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            r1.close()     // Catch: java.io.IOException -> L34
        L34:
            return r4
        L35:
            r4 = move-exception
            r0 = r1
            goto L3f
        L38:
            goto L45
        L3a:
            r4 = move-exception
            goto L3f
        L3c:
            r1 = r0
            goto L45
        L3f:
            if (r0 == 0) goto L44
            r0.close()     // Catch: java.io.IOException -> L44
        L44:
            throw r4
        L45:
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r0
    }
}
