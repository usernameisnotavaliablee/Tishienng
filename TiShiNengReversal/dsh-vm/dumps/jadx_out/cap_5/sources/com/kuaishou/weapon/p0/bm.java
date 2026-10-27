package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bm {
    public bm() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> Ld
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto Ld
            int r0 = r0.densityDpi     // Catch: java.lang.Exception -> Ld
            return r0
        Ld:
            r0 = -1
            return r0
    }

    public static org.json.JSONObject a() {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2c
            r0.<init>()     // Catch: java.lang.Exception -> L2c
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L2c
            java.util.TimeZone r1 = r1.getTimeZone()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L2c
            java.lang.String r2 = "0"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2c
            int r3 = r1.getOffset(r3)     // Catch: java.lang.Exception -> L2c
            int r3 = r3 / 1000
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L2c
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = "1"
            java.lang.String r1 = r1.getID()     // Catch: java.lang.Exception -> L2c
            r0.put(r2, r1)     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            r0 = 0
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = "0"
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = ""
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = r0
        Ld:
            if (r1 != 0) goto L10
            return r0
        L10:
            return r1
    }

    public static org.json.JSONObject d() {
            java.lang.String r0 = ";"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "lsmod"
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L68
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L68
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L65
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L65
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L65
        L25:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L5c
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L25
            java.lang.String r2 = com.kuaishou.weapon.p0.bo.a(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r5 = "-"
            boolean r5 = r2.contains(r5)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L25
            boolean r5 = r2.contains(r0)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L25
            java.lang.String r5 = ";;;"
            java.lang.String r2 = r2.replace(r5, r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L5a
            int r5 = r2.length     // Catch: java.lang.Throwable -> L5a
            r6 = 1
            if (r5 <= r6) goto L25
            r5 = 0
            r5 = r2[r5]     // Catch: java.lang.Throwable -> L5a
            r2 = r2[r6]     // Catch: java.lang.Throwable -> L5a
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L5a
            goto L25
        L5a:
            goto L63
        L5c:
            r4.close()     // Catch: java.io.IOException -> L5f
        L5f:
            r3.close()     // Catch: java.io.IOException -> L74
            goto L74
        L63:
            r2 = r4
            goto L6a
        L65:
            r3 = r2
            goto L63
        L68:
            r3 = r2
        L6a:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L70
            goto L71
        L70:
        L71:
            if (r3 == 0) goto L74
            goto L5f
        L74:
            return r1
    }
}
