package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l0 {
    private android.hardware.Camera a;

    public l0() {
            r0 = this;
            r0.<init>()
            return
    }

    public synchronized com.huawei.hms.scankit.p.k0 a() {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            android.hardware.Camera r1 = r3.a     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23
            int r1 = r1.getMaxNumMeteringAreas()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L23
            android.hardware.Camera r2 = r3.a     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            java.util.List r2 = r2.getMeteringAreas()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            android.hardware.Camera$Area r0 = (android.hardware.Camera.Area) r0     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            android.graphics.Rect r0 = r0.rect     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L21
            goto L2a
        L1f:
            r0 = move-exception
            goto L31
        L21:
            r0 = move-exception
            goto L26
        L23:
            r1 = move-exception
            r0 = r1
            r1 = 0
        L26:
            r0.getMessage()     // Catch: java.lang.Throwable -> L1f
            r0 = 0
        L2a:
            com.huawei.hms.scankit.p.k0 r2 = new com.huawei.hms.scankit.p.k0     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r2
        L31:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r0
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

    public synchronized void a(java.util.List<com.huawei.hms.scankit.p.k0.a> r7) {
            r6 = this;
            monitor-enter(r6)
            android.hardware.Camera r0 = r6.a     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L7
            monitor-exit(r6)
            return
        L7:
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r1.<init>()     // Catch: java.lang.Throwable -> L32
            r2 = 0
        L11:
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L32
            if (r2 >= r3) goto L34
            android.hardware.Camera$Area r3 = new android.hardware.Camera$Area     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r7.get(r2)     // Catch: java.lang.Throwable -> L32
            com.huawei.hms.scankit.p.k0$a r4 = (com.huawei.hms.scankit.p.k0.a) r4     // Catch: java.lang.Throwable -> L32
            android.graphics.Rect r4 = r4.a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r5 = r7.get(r2)     // Catch: java.lang.Throwable -> L32
            com.huawei.hms.scankit.p.k0$a r5 = (com.huawei.hms.scankit.p.k0.a) r5     // Catch: java.lang.Throwable -> L32
            int r5 = r5.b     // Catch: java.lang.Throwable -> L32
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L32
            r1.add(r3)     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + 1
            goto L11
        L32:
            r7 = move-exception
            goto L43
        L34:
            r0.setMeteringAreas(r1)     // Catch: java.lang.Throwable -> L32
            android.hardware.Camera r7 = r6.a     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L3d
            r7.setParameters(r0)     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L3d
            goto L41
        L3d:
            r7 = move-exception
            r7.getMessage()     // Catch: java.lang.Throwable -> L32
        L41:
            monitor-exit(r6)
            return
        L43:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L32
            throw r7
    }
}
