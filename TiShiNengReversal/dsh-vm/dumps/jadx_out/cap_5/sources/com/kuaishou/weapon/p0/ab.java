package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ab {
    public ab() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.lang.String r4 = "/proc/"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.lang.String r4 = "/status"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L44
        L22:
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r2 = "TracerPid"
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r2 == 0) goto L22
            java.lang.String r2 = "\t"
            java.lang.String r3 = " "
            java.lang.String r0 = r0.replace(r2, r3)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r1.close()     // Catch: java.lang.Exception -> L39
        L39:
            return r0
        L3a:
            r0 = move-exception
            goto L46
        L3c:
            r0 = r1
            goto L4c
        L3f:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L46
        L44:
            goto L4c
        L46:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.lang.Exception -> L4b
        L4b:
            throw r0
        L4c:
            if (r0 == 0) goto L51
            r0.close()     // Catch: java.lang.Exception -> L51
        L51:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean a(android.content.Context r3) {
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L17
            r2 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L17
            int r3 = r3.flags     // Catch: java.lang.Throwable -> L17
            r3 = r3 & 2
            r1 = 1
            if (r3 != r1) goto L17
            return r1
        L17:
            return r0
    }

    public static boolean b() {
            boolean r0 = android.os.Debug.isDebuggerConnected()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r5) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L30
            r2 = 24
            r3 = 8192(0x2000, float:1.148E-41)
            r4 = 1
            if (r1 < r2) goto L1d
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo(r5, r3)     // Catch: java.lang.Throwable -> L30
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L30
            r5 = r5 & 2
            if (r5 != r4) goto L30
            return r4
        L1d:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo(r5, r3)     // Catch: java.lang.Throwable -> L30
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L30
            r5 = r5 & 2
            if (r5 != r4) goto L30
            return r4
        L30:
            return r0
    }
}
