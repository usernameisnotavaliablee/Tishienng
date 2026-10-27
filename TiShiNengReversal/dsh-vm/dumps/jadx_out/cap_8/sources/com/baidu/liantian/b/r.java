package com.baidu.liantian.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static final int f5934b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.baidu.liantian.b.r f5935c;
    private java.util.concurrent.ThreadPoolExecutor a;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.baidu.liantian.b.r.f5934b = r0
            return
    }

    private r() {
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.a = r0
            int r0 = com.baidu.liantian.b.r.f5934b
            if (r0 > 0) goto Ld
            r0 = 1
            r2 = 1
            goto Le
        Ld:
            r2 = r0
        Le:
            com.baidu.liantian.b.a()
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r4 = 0
            r3 = r2
            r1.<init>(r2, r3, r4, r6, r7)
            r8.a = r1
            return
    }

    public static com.baidu.liantian.b.r a() {
            com.baidu.liantian.b.r r0 = com.baidu.liantian.b.r.f5935c
            if (r0 != 0) goto L1c
            java.lang.Class<com.baidu.liantian.b.r> r0 = com.baidu.liantian.b.r.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L19
            com.baidu.liantian.b.r r1 = com.baidu.liantian.b.r.f5935c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.baidu.liantian.b.r r1 = new com.baidu.liantian.b.r     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.baidu.liantian.b.r.f5935c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L1c
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1     // Catch: java.lang.Throwable -> L19
        L19:
            com.baidu.liantian.b.e.a()
        L1c:
            com.baidu.liantian.b.r r0 = com.baidu.liantian.b.r.f5935c
            return r0
    }

    public final void a(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.a     // Catch: java.lang.Throwable -> L6
            r0.execute(r2)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            com.baidu.liantian.b.e.a()
            return
    }
}
