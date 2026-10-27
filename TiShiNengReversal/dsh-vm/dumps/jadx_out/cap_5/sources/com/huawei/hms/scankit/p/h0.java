package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h0 {
    private android.hardware.Camera a;

    public h0() {
            r0 = this;
            r0.<init>()
            return
    }

    public synchronized com.huawei.hms.scankit.p.g0 a() {
            r5 = this;
            monitor-enter(r5)
            android.hardware.Camera r0 = r5.a     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L30
            int r0 = r0.getMaxExposureCompensation()     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera r1 = r5.a     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Throwable -> L30
            int r1 = r1.getMinExposureCompensation()     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera r2 = r5.a     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L30
            int r2 = r2.getExposureCompensation()     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera r3 = r5.a     // Catch: java.lang.Throwable -> L30
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch: java.lang.Throwable -> L30
            float r3 = r3.getExposureCompensationStep()     // Catch: java.lang.Throwable -> L30
            com.huawei.hms.scankit.p.g0 r4 = new com.huawei.hms.scankit.p.g0     // Catch: java.lang.Throwable -> L30
            r4.<init>(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r5)
            return r4
        L30:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    public synchronized void a(int r2) {
            r1 = this;
            monitor-enter(r1)
            android.hardware.Camera r0 = r1.a     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L7
            monitor-exit(r1)
            return
        L7:
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            r0.setExposureCompensation(r2)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            r0.getAutoExposureLock()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            android.hardware.Camera r2 = r1.a     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            r2.setParameters(r0)     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            r0.getAutoExposureLock()     // Catch: java.lang.Throwable -> L1a java.lang.RuntimeException -> L1c
            goto L1c
        L1a:
            r2 = move-exception
            goto L1e
        L1c:
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
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
}
