package com.bytedance.android.openliveplugin.process;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveProcessUtils {
    private static java.lang.String currentProcessName;

    public LiveProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getCurrentProcessName(android.content.Context r1) {
            java.lang.String r0 = com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName
            return r1
        Lb:
            java.lang.String r0 = getCurrentProcessNameByApplication()
            com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r1 = com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName
            return r1
        L1a:
            java.lang.String r0 = getCurrentProcessNameByActivityThread()
            com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r1 = com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName
            return r1
        L29:
            java.lang.String r1 = getCurrentProcessNameByActivityManager(r1)
            com.bytedance.android.openliveplugin.process.LiveProcessUtils.currentProcessName = r1
            return r1
    }

    private static java.lang.String getCurrentProcessNameByActivityManager(android.content.Context r4) {
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

    private static java.lang.String getCurrentProcessNameByActivityThread() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            goto L26
        L25:
            return r0
        L26:
            com.bytedance.sdk.openadsdk.api.m.j(r1)
            return r0
    }

    private static java.lang.String getCurrentProcessNameByApplication() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r0)
        Lf:
            r0 = 0
            return r0
    }

    public static java.lang.Boolean inLiveProcess(android.content.Context r1) {
            if (r1 == 0) goto L1c
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            java.lang.String r1 = getCurrentProcessName(r1)
            java.lang.String r0 = ":bytelive"
            boolean r1 = r1.endsWith(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
    }

    public static boolean isMainProcess(android.content.Context r1) {
            if (r1 == 0) goto L22
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto Ld
            goto L22
        Ld:
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = getCurrentProcessName(r1)
            boolean r1 = android.text.TextUtils.equals(r0, r1)
            return r1
        L22:
            r1 = 0
            return r1
    }
}
