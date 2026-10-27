package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class MMKVProcessUtil {
    private static java.lang.String currentProcessName = "";

    static {
            return
    }

    MMKVProcessUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getCurrentProcessName(@androidx.annotation.NonNull android.content.Context r1) {
            java.lang.String r0 = com.tencent.mmkv.MMKVProcessUtil.currentProcessName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = com.tencent.mmkv.MMKVProcessUtil.currentProcessName
            return r1
        Lb:
            java.lang.String r0 = getCurrentProcessNameByApplication()
            com.tencent.mmkv.MMKVProcessUtil.currentProcessName = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r1 = com.tencent.mmkv.MMKVProcessUtil.currentProcessName
            return r1
        L1a:
            java.lang.String r0 = getCurrentProcessNameByActivityThread()
            com.tencent.mmkv.MMKVProcessUtil.currentProcessName = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r1 = com.tencent.mmkv.MMKVProcessUtil.currentProcessName
            return r1
        L29:
            java.lang.String r1 = getCurrentProcessNameByActivityManager(r1)
            com.tencent.mmkv.MMKVProcessUtil.currentProcessName = r1
            return r1
    }

    private static java.lang.String getCurrentProcessNameByActivityManager(@androidx.annotation.NonNull android.content.Context r3) {
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            if (r3 == 0) goto L2b
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L2b
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            if (r2 != r0) goto L18
            java.lang.String r3 = r1.processName
            return r3
        L2b:
            java.lang.String r3 = ""
            return r3
    }

    @androidx.annotation.NonNull
    private static java.lang.String getCurrentProcessNameByActivityThread() {
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            java.lang.String r0 = ""
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.String getCurrentProcessNameByApplication() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.work.impl.utils.d.a()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }
}
