package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class i {
    private static volatile java.lang.String a;

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r4) {
            java.lang.Class<com.qq.e.comm.managers.plugin.i> r0 = com.qq.e.comm.managers.plugin.i.class
            monitor-enter(r0)
            java.lang.String r1 = com.qq.e.comm.managers.plugin.i.a     // Catch: java.lang.Throwable -> Lf
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            java.lang.String r4 = com.qq.e.comm.managers.plugin.i.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r4
        Lf:
            r4 = move-exception
            goto L52
        L11:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lf
            r2 = 28
            if (r1 < r2) goto L21
            java.lang.String r4 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> Lf
            com.qq.e.comm.managers.plugin.i.a = r4     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = com.qq.e.comm.managers.plugin.i.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r4
        L21:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> Lf
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Throwable -> Lf
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: java.lang.Throwable -> Lf
            if (r4 == 0) goto L4f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lf
        L37:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            int r3 = r2.pid     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            if (r3 != r1) goto L37
            java.lang.String r2 = r2.processName     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            com.qq.e.comm.managers.plugin.i.a = r2     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            java.lang.String r4 = com.qq.e.comm.managers.plugin.i.a     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L37
            monitor-exit(r0)
            return r4
        L4f:
            monitor-exit(r0)
            r4 = 0
            return r4
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    public static synchronized java.lang.String a(java.lang.String r4) {
            java.lang.Class<com.qq.e.comm.managers.plugin.i> r0 = com.qq.e.comm.managers.plugin.i.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto Lb
            monitor-exit(r0)
            return r4
        Lb:
            java.lang.String r1 = com.qq.e.comm.managers.plugin.i.a     // Catch: java.lang.Throwable -> L26
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L3a
            java.lang.String r2 = "_"
            boolean r2 = r1.endsWith(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.String r4 = ""
            goto L2a
        L26:
            r4 = move-exception
            goto L3c
        L28:
            java.lang.String r4 = "_"
        L2a:
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = com.qq.e.comm.managers.plugin.d.a(r1)     // Catch: java.lang.Throwable -> L26
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            return r4
        L3a:
            monitor-exit(r0)
            return r4
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }
}
