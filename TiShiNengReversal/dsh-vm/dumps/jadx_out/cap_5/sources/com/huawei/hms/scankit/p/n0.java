package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n0 {
    private android.hardware.Camera a;

    public n0() {
            r0 = this;
            r0.<init>()
            return
    }

    public synchronized com.huawei.hms.scankit.p.m0 a() {
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.a     // Catch: java.lang.Throwable -> L26
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L26
            int r0 = r0.getMaxZoom()     // Catch: java.lang.Throwable -> L26
            android.hardware.Camera r1 = r4.a     // Catch: java.lang.Throwable -> L26
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Throwable -> L26
            int r1 = r1.getZoom()     // Catch: java.lang.Throwable -> L26
            android.hardware.Camera r2 = r4.a     // Catch: java.lang.Throwable -> L26
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L26
            java.util.List r2 = r2.getZoomRatios()     // Catch: java.lang.Throwable -> L26
            com.huawei.hms.scankit.p.m0 r3 = new com.huawei.hms.scankit.p.m0     // Catch: java.lang.Throwable -> L26
            r3.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r4)
            return r3
        L26:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    public synchronized void a(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.hardware.Camera r0 = r1.a     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L14
            r0.setZoom(r2)     // Catch: java.lang.Throwable -> L14
            android.hardware.Camera r2 = r1.a     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
            r2.setParameters(r0)     // Catch: java.lang.Throwable -> L14 java.lang.RuntimeException -> L16
            goto L1a
        L14:
            r2 = move-exception
            goto L1c
        L16:
            r2 = move-exception
            r2.getMessage()     // Catch: java.lang.Throwable -> L14
        L1a:
            monitor-exit(r1)
            return
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public synchronized void a(android.hardware.Camera r1) {
            r0 = this;
            monitor-enter(r0)
            r0.a = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public synchronized boolean b() {
            r1 = this;
            monitor-enter(r1)
            android.hardware.Camera r0 = r1.a     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isZoomSupported()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r0
    }
}
