package com.beizi.ad.lance.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static final int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7255b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> f7256c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> f7257d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.util.concurrent.ArrayBlockingQueue<java.lang.Runnable> f7258e = null;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.beizi.ad.lance.a.e.a = r0
            int r0 = r0 / 2
            int r0 = r0 + 1
            r1 = 4
            int r0 = java.lang.Math.max(r0, r1)
            com.beizi.ad.lance.a.e.f7255b = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.beizi.ad.lance.a.e.f7256c = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.beizi.ad.lance.a.e.f7257d = r0
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 50
            r0.<init>(r1)
            com.beizi.ad.lance.a.e.f7258e = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.concurrent.ThreadPoolExecutor a() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = com.beizi.ad.lance.a.e.f7255b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.ad.lance.a.e.f7256c
            com.beizi.ad.lance.a.d r7 = new com.beizi.ad.lance.a.d
            r1 = 5
            java.lang.String r3 = "BeiZi-adsdk-adrequest-thread-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = f()
            r1 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor b() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = com.beizi.ad.lance.a.e.f7255b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.ad.lance.a.e.f7256c
            com.beizi.ad.lance.a.d r7 = new com.beizi.ad.lance.a.d
            r1 = 5
            java.lang.String r3 = "BeiZi-adsdk-adrequest-thread-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = f()
            r1 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor c() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.ad.lance.a.e.f7257d
            com.beizi.ad.lance.a.d r7 = new com.beizi.ad.lance.a.d
            r1 = 5
            java.lang.String r2 = "BeiZi-adsdk-heartbeat-thread-"
            r7.<init>(r1, r2)
            java.util.concurrent.RejectedExecutionHandler r8 = f()
            r1 = 0
            r2 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor d() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ArrayBlockingQueue<java.lang.Runnable> r6 = com.beizi.ad.lance.a.e.f7258e
            com.beizi.ad.lance.a.d r7 = new com.beizi.ad.lance.a.d
            r1 = 5
            java.lang.String r2 = "BeiZi-adsdk-file-log-upload-thread-"
            r7.<init>(r1, r2)
            java.util.concurrent.RejectedExecutionHandler r8 = f()
            r1 = 2
            r2 = 6
            r3 = 20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ScheduledThreadPoolExecutor e() {
            r0 = 4
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = (java.util.concurrent.ScheduledThreadPoolExecutor) r0
            return r0
    }

    public static java.util.concurrent.RejectedExecutionHandler f() {
            com.beizi.ad.lance.a.e$1 r0 = new com.beizi.ad.lance.a.e$1
            r0.<init>()
            return r0
    }
}
