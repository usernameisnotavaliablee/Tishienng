package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c implements java.lang.Thread.UncaughtExceptionHandler {
    private android.app.Application a;

    public c(android.app.Application r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Process.myPid()
            android.os.Process.killProcess(r3)
            android.app.Application r3 = r2.a
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r0 = r4.pid
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto L19
            android.app.Application r3 = r2.a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = r4.processName
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L42
            int r3 = android.os.Process.myPid()
            android.os.Process.killProcess(r3)
        L42:
            return
    }
}
