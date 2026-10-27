package com.bytedance.j.xt.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static volatile android.os.HandlerThread a;
    private static volatile android.os.Handler b;
    private static volatile android.os.Handler c;

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.HandlerThread a() {
            android.os.HandlerThread r0 = com.bytedance.j.xt.up.a.a
            if (r0 != 0) goto L2b
            java.lang.Class<com.bytedance.j.xt.up.a> r0 = com.bytedance.j.xt.up.a.class
            monitor-enter(r0)
            android.os.HandlerThread r1 = com.bytedance.j.xt.up.a.a     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L27
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "default_npth_thread"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            com.bytedance.j.xt.up.a.a = r1     // Catch: java.lang.Throwable -> L25
            r1.start()     // Catch: java.lang.Throwable -> L25
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L25
            android.os.HandlerThread r2 = com.bytedance.j.xt.up.a.a     // Catch: java.lang.Throwable -> L25
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            com.bytedance.j.xt.up.a.b = r1     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r1 = move-exception
            goto L29
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
        L2b:
            android.os.HandlerThread r0 = com.bytedance.j.xt.up.a.a
            return r0
    }

    public static android.os.Handler b() {
            android.os.Handler r0 = com.bytedance.j.xt.up.a.b
            if (r0 != 0) goto L7
            a()
        L7:
            android.os.Handler r0 = com.bytedance.j.xt.up.a.b
            return r0
    }
}
