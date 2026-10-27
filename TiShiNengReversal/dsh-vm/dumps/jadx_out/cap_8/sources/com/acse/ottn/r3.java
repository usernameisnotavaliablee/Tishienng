package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r3 {
    public static final java.lang.String a = "RomUtils";

    public r3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r7) {
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils"
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r4.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r4.append(r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40
            r4.close()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40
            r4.close()     // Catch: java.io.IOException -> L39
            return r3
        L39:
            r7 = move-exception
            com.acse.ottn.h2.a(r1, r0, r7)
            return r3
        L3e:
            r7 = move-exception
            goto L42
        L40:
            r3 = move-exception
            goto L48
        L42:
            r2 = r4
            goto L67
        L44:
            r7 = move-exception
            goto L67
        L46:
            r3 = move-exception
            r4 = r2
        L48:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "Unable to read sysprop "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            com.acse.ottn.h2.a(r1, r7, r3)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L66
            r4.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r7 = move-exception
            com.acse.ottn.h2.a(r1, r0, r7)
        L66:
            return r2
        L67:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L6d
            goto L71
        L6d:
            r2 = move-exception
            com.acse.ottn.h2.a(r1, r0, r2)
        L71:
            throw r7
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
            java.lang.String r0 = a(r0)
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
            java.lang.String r0 = a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean e() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "OPPO"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L15
            java.lang.String r1 = "oppo"
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

    public static double f() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = a(r0)     // Catch: java.lang.Exception -> L17
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

    public static int g() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = a(r0)
            if (r0 == 0) goto L28
            r1 = 1
            java.lang.String r1 = r0.substring(r1)     // Catch: java.lang.Exception -> L12
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L12
            return r0
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get miui version code error, version : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "RomUtils"
            com.acse.ottn.h2.b(r1, r0)
        L28:
            r0 = -1
            return r0
    }
}
