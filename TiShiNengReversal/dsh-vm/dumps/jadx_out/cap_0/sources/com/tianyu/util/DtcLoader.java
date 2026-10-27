package com.tianyu.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_0_sz45352584.dex */
public class DtcLoader {
    static {
            java.lang.String r0 = "jgdtc"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L6
        L5:
            return
        L6:
            r0 = move-exception
            java.lang.String r0 = a()     // Catch: java.lang.Throwable -> Lf
            java.lang.System.load(r0)     // Catch: java.lang.Throwable -> Lf
            goto L5
        Lf:
            r0 = move-exception
            goto L5
    }

    public DtcLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a() {
            java.lang.String r0 = "q~tb\u007fyt>q``>QsdyfydiDxbuqt"
            java.lang.String r0 = com.tianyu.util.a.a(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "sebbu~dQsdyfydiDxbuqt"
            java.lang.String r1 = com.tianyu.util.a.a(r1)     // Catch: java.lang.Throwable -> L52
            r2 = 0
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L52
            r2 = 0
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "wudCicdu}S\u007f~duhd"
            java.lang.String r2 = com.tianyu.util.a.a(r2)     // Catch: java.lang.Throwable -> L52
            r3 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L52
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L52
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L52
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "com.bxkj.student"
            r2 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "/libjgdtc.so"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
        L51:
            return r0
        L52:
            r0 = move-exception
            java.lang.String r0 = "/data/data/com.bxkj.student/lib/libjgdtc.so"
            goto L51
    }

    public static void init() {
            return
    }
}
