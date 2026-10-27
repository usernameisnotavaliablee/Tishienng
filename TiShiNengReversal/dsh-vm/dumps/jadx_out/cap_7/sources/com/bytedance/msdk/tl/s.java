package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class s {
    private static java.lang.String j;

    public s() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String cw(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Process.myPid()
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            if (r4 == 0) goto L2f
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 == 0) goto L2f
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r3 = r2.pid
            if (r3 != r1) goto L1c
            java.lang.String r4 = r2.processName
            return r4
        L2f:
            return r0
    }

    private static java.lang.String j() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lf:
            r0 = 0
            return r0
    }

    public static boolean j(android.content.Context r3) {
            r0 = 0
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto Lc
            return r0
        Lc:
            java.lang.String r3 = xt(r3)     // Catch: java.lang.Throwable -> L18
            boolean r3 = r1.equalsIgnoreCase(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L18:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L1c:
            return r0
    }

    private static java.lang.String xt() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            goto L28
        L27:
            return r0
        L28:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }

    public static java.lang.String xt(android.content.Context r1) {
            java.lang.String r0 = com.bytedance.msdk.tl.s.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = com.bytedance.msdk.tl.s.j
            return r1
        Lb:
            java.lang.String r0 = j()
            com.bytedance.msdk.tl.s.j = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r1 = com.bytedance.msdk.tl.s.j
            return r1
        L1a:
            java.lang.String r0 = xt()
            com.bytedance.msdk.tl.s.j = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r1 = com.bytedance.msdk.tl.s.j
            return r1
        L29:
            java.lang.String r1 = cw(r1)
            com.bytedance.msdk.tl.s.j = r1
            return r1
    }
}
