package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i {
    private static final int a = 0;
    private static final int b = 0;
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> c = null;
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> d = null;
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> e = null;
    private static final java.util.concurrent.ArrayBlockingQueue<java.lang.Runnable> f = null;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.beizi.fusion.tool.i.a = r0
            int r0 = r0 / 2
            int r0 = r0 + 1
            r1 = 4
            int r0 = java.lang.Math.max(r0, r1)
            com.beizi.fusion.tool.i.b = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.beizi.fusion.tool.i.c = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.beizi.fusion.tool.i.d = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            com.beizi.fusion.tool.i.e = r0
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 200(0xc8, float:2.8E-43)
            r0.<init>(r1)
            com.beizi.fusion.tool.i.f = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.concurrent.ThreadPoolExecutor a() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = com.beizi.fusion.tool.i.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.fusion.tool.i.c
            com.beizi.fusion.tool.h r7 = new com.beizi.fusion.tool.h
            r1 = 5
            java.lang.String r3 = "afAd-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = e()
            r1 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor b() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = com.beizi.fusion.tool.i.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.fusion.tool.i.d
            com.beizi.fusion.tool.h r7 = new com.beizi.fusion.tool.h
            r1 = 5
            java.lang.String r3 = "afHb-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = e()
            r1 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor c() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ArrayBlockingQueue<java.lang.Runnable> r6 = com.beizi.fusion.tool.i.f
            com.beizi.fusion.tool.h r7 = new com.beizi.fusion.tool.h
            r1 = 5
            java.lang.String r2 = "afFu-"
            r7.<init>(r1, r2)
            java.util.concurrent.RejectedExecutionHandler r8 = e()
            r1 = 2
            r2 = 20
            r3 = 20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor d() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = com.beizi.fusion.tool.i.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = com.beizi.fusion.tool.i.e
            com.beizi.fusion.tool.h r7 = new com.beizi.fusion.tool.h
            r1 = 5
            java.lang.String r3 = "afIt-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = e()
            r1 = 2
            r3 = 20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.RejectedExecutionHandler e() {
            com.beizi.fusion.tool.i$1 r0 = new com.beizi.fusion.tool.i$1
            r0.<init>()
            return r0
    }
}
