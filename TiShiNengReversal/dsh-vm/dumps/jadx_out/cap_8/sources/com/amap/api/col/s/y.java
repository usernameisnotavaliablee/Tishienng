package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.amap.api.col.s.y f4855c;
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f4856b;

    private y() {
            r9 = this;
            r9.<init>()
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r9.a = r0
            r0 = 0
            r9.f4856b = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r2 = r0.availableProcessors()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            int r3 = r2 * 2
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r7 = r9.a
            java.util.concurrent.ThreadPoolExecutor$AbortPolicy r8 = new java.util.concurrent.ThreadPoolExecutor$AbortPolicy
            r8.<init>()
            r4 = 1
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r9.f4856b = r1
            return
    }

    public static com.amap.api.col.s.y a() {
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.f4855c
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.s.y> r0 = com.amap.api.col.s.y.class
            monitor-enter(r0)
            com.amap.api.col.s.y r1 = com.amap.api.col.s.y.f4855c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.s.y r1 = new com.amap.api.col.s.y     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.y.f4855c = r1     // Catch: java.lang.Throwable -> L13
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
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.f4855c
            return r0
    }

    public static void c() {
            com.amap.api.col.s.y r0 = com.amap.api.col.s.y.f4855c
            if (r0 == 0) goto L20
            java.lang.Class<com.amap.api.col.s.y> r0 = com.amap.api.col.s.y.class
            monitor-enter(r0)
            com.amap.api.col.s.y r1 = com.amap.api.col.s.y.f4855c     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            com.amap.api.col.s.y r1 = com.amap.api.col.s.y.f4855c     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.ExecutorService r1 = r1.f4856b     // Catch: java.lang.Throwable -> L1a
            r1.shutdownNow()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.s.y r1 = com.amap.api.col.s.y.f4855c     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            r1.f4856b = r2     // Catch: java.lang.Throwable -> L1a
            com.amap.api.col.s.y.f4855c = r2     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        L20:
            return
    }

    public final void b(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f4856b
            if (r0 == 0) goto L7
            r0.execute(r2)
        L7:
            return
    }
}
