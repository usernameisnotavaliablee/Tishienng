package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bo {
    public bo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r3) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L38
            r2 = 23
            if (r1 >= r2) goto L8
            return r0
        L8:
            java.lang.String r1 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Exception -> L38
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3     // Catch: java.lang.Exception -> L38
            if (r3 == 0) goto L38
            r1 = -1
            java.util.List r3 = r3.getSensorList(r1)     // Catch: java.lang.Exception -> L38
            int r1 = r3.size()     // Catch: java.lang.Exception -> L38
            if (r1 <= 0) goto L38
            java.util.ListIterator r3 = r3.listIterator()     // Catch: java.lang.Exception -> L38
        L21:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L38
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Exception -> L38
            int r1 = r1.getType()     // Catch: java.lang.Exception -> L38
            r2 = 9
            if (r1 != r2) goto L21
            return r0
        L36:
            r3 = 1
            return r3
        L38:
            return r0
    }

    public static long a() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = "cat /proc/uptime"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L5c
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L5c
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L59
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L59
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L59
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L59
            r3 = 0
        L20:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L43
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = ";"
            java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L20
            int r5 = r0.length     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L20
            r3 = 0
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L41
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L41
            double r3 = r0.doubleValue()     // Catch: java.lang.Throwable -> L41
            goto L20
        L41:
            goto L57
        L43:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r7
            long r3 = (long) r3
            long r5 = r5 - r3
            r2.close()     // Catch: java.io.IOException -> L53
        L53:
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L6c
        L57:
            r0 = r2
            goto L5e
        L59:
            r1 = r0
            goto L57
        L5c:
            r1 = r0
        L5e:
            if (r0 == 0) goto L65
            r0.close()     // Catch: java.io.IOException -> L64
            goto L65
        L64:
        L65:
            if (r1 == 0) goto L6a
            r1.close()     // Catch: java.io.IOException -> L6a
        L6a:
            r5 = -1
        L6c:
            return r5
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.String r0 = ";"
            java.lang.String r1 = "      "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "     "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "    "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "   "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "  "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = " "
            java.lang.String r2 = r2.replace(r1, r0)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r2 = 0
            return r2
    }

    public static long b() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "cat /proc/uptime"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L5a
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L5a
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L57
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L57
            r3 = 0
        L20:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L43
            java.lang.String r0 = a(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = ";"
            java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L20
            int r5 = r0.length     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L20
            r3 = 0
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L41
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L41
            double r3 = r0.doubleValue()     // Catch: java.lang.Throwable -> L41
            goto L20
        L41:
            goto L55
        L43:
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L41
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 * r5
            long r3 = (long) r3
            r2.close()     // Catch: java.io.IOException -> L51
        L51:
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6a
        L55:
            r0 = r2
            goto L5c
        L57:
            r1 = r0
            goto L55
        L5a:
            r1 = r0
        L5c:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.io.IOException -> L62
            goto L63
        L62:
        L63:
            if (r1 == 0) goto L68
            r1.close()     // Catch: java.io.IOException -> L68
        L68:
            r3 = -1
        L6a:
            return r3
    }
}
