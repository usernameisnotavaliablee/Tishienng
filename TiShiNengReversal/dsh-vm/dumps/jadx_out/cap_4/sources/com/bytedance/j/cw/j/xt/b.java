package com.bytedance.j.cw.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    private static volatile com.bytedance.j.cw.j.xt.b a;
    private static volatile java.util.concurrent.ThreadPoolExecutor b;
    private static volatile java.util.concurrent.ThreadPoolExecutor c;
    private static volatile java.util.concurrent.ScheduledExecutorService d;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.j.cw.j.xt.a> e = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.j.cw.j.xt.a> f = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.j.cw.j.xt.b.e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.j.cw.j.xt.b.f = r0
            return
    }

    private b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.j.cw.j.xt.d.b()
            com.bytedance.j.cw.j.xt.b.b = r0
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.j.cw.j.xt.d.c()
            com.bytedance.j.cw.j.xt.b.c = r0
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.j.cw.j.xt.d.a()
            com.bytedance.j.cw.j.xt.b.d = r0
            return
    }

    public static com.bytedance.j.cw.j.xt.b a() {
            com.bytedance.j.cw.j.xt.b r0 = com.bytedance.j.cw.j.xt.b.a
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.j.cw.j.xt.b> r0 = com.bytedance.j.cw.j.xt.b.class
            monitor-enter(r0)
            com.bytedance.j.cw.j.xt.b r1 = com.bytedance.j.cw.j.xt.b.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.j.cw.j.xt.b r1 = new com.bytedance.j.cw.j.xt.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.j.cw.j.xt.b.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.j.cw.j.xt.b r0 = com.bytedance.j.cw.j.xt.b.a
            return r0
    }

    public void b(com.bytedance.j.cw.j.xt.a r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.j.cw.j.xt.b.b
            if (r0 == 0) goto Lb
            java.util.concurrent.ThreadPoolExecutor r0 = com.bytedance.j.cw.j.xt.b.b
            r0.execute(r2)
        Lb:
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "param is not be null"
            r2.<init>(r0)
            throw r2
    }
}
