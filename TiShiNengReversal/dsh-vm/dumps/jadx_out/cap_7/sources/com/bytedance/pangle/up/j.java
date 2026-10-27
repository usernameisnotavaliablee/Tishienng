package com.bytedance.pangle.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static java.lang.Class j;
    private static java.lang.Object xt;


    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.Object j() {
            java.lang.Object r0 = com.bytedance.pangle.up.j.xt
            if (r0 != 0) goto L70
            java.lang.Class<com.bytedance.pangle.up.j> r0 = com.bytedance.pangle.up.j.class
            monitor-enter(r0)     // Catch: java.lang.Exception -> L68
            java.lang.Object r1 = com.bytedance.pangle.up.j.xt     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L27
            java.lang.Class r1 = com.bytedance.pangle.up.j.j     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
            com.bytedance.pangle.up.j.j = r1     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L66
        L1a:
            java.lang.Class r1 = com.bytedance.pangle.up.j.j     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = com.bytedance.pangle.util.MethodUtils.invokeStaticMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
            com.bytedance.pangle.up.j.xt = r1     // Catch: java.lang.Throwable -> L18
        L27:
            java.lang.Object r1 = com.bytedance.pangle.up.j.xt     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L64
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L18
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            if (r1 == r2) goto L64
            java.lang.Object r1 = new java.lang.Object     // Catch: java.lang.Throwable -> L18
            r1.<init>()     // Catch: java.lang.Throwable -> L18
            android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L18
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18
            com.bytedance.pangle.up.j$1 r3 = new com.bytedance.pangle.up.j$1     // Catch: java.lang.Throwable -> L18
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L18
            r2.post(r3)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = com.bytedance.pangle.up.j.xt     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L18
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L60
        L56:
            r2 = move-exception
            goto L62
        L58:
            r2 = move-exception
            java.lang.String r3 = "Zeus_pangle"
            java.lang.String r4 = "ActivityThreadHelper currentActivityThread interruptedException failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r3, r4, r2)     // Catch: java.lang.Throwable -> L56
        L60:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            goto L64
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L18
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            goto L70
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1     // Catch: java.lang.Exception -> L68
        L68:
            r0 = move-exception
            java.lang.String r1 = "Zeus_pangle"
            java.lang.String r2 = "ActivityThreadHelper currentActivityThread failed."
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)
        L70:
            java.lang.Object r0 = com.bytedance.pangle.up.j.xt
            return r0
    }

    static /* synthetic */ java.lang.Object j(java.lang.Object r0) {
            com.bytedance.pangle.up.j.xt = r0
            return r0
    }

    static /* synthetic */ java.lang.Class xt() {
            java.lang.Class r0 = com.bytedance.pangle.up.j.j
            return r0
    }
}
