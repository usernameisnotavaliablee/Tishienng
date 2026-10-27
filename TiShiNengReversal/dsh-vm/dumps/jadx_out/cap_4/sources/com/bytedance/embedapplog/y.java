package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class y {
    private static volatile java.lang.Object j;

    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.Object j() {
            r2 = this;
            java.lang.Object r0 = com.bytedance.embedapplog.y.j
            if (r0 != 0) goto L23
            java.lang.Class<com.bytedance.embedapplog.y> r0 = com.bytedance.embedapplog.y.class
            monitor-enter(r0)
            java.lang.Object r1 = com.bytedance.embedapplog.y.j     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L18
            com.bytedance.embedapplog.y.j = r1     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
        L23:
            java.lang.Object r0 = com.bytedance.embedapplog.y.j
            return r0
    }

    public java.lang.String j(java.lang.String r8) {
            r7 = this;
            java.lang.String r8 = android.os.SystemProperties.get(r8)     // Catch: java.lang.Throwable -> L5
            return r8
        L5:
            r0 = move-exception
            com.bytedance.embedapplog.uc.j(r0)
            java.lang.Object r0 = r7.j()     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2a
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2a
            r2[r6] = r8     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2a
            return r8
        L2a:
            r8 = move-exception
            com.bytedance.embedapplog.uc.j(r8)
            java.lang.String r8 = ""
            return r8
    }
}
