package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private android.os.PowerManager.WakeLock a;
    private boolean b;

    public g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.b = r0
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public synchronized boolean b(android.app.Activity r3) {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto L6
            monitor-exit(r2)
            return r0
        L6:
            boolean r1 = r3.isDestroyed()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto Le
            monitor-exit(r2)
            return r0
        Le:
            java.lang.String r1 = "power"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L2b
            android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.String r0 = "CpuWakeLock"
            r1 = 536870913(0x20000001, float:1.0842023E-19)
            android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r1, r0)     // Catch: java.lang.Throwable -> L2b
            r2.a = r3     // Catch: java.lang.Throwable -> L2b
            r3.acquire()     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            r2.b = r3     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r2)
            return r3
        L2b:
            r3 = move-exception
            goto L2f
        L2d:
            monitor-exit(r2)
            return r0
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r3
    }

    public synchronized void c() {
            r1 = this;
            monitor-enter(r1)
            android.os.PowerManager$WakeLock r0 = r1.a     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r0.release()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r1.a = r0     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r1.b = r0     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }
}
