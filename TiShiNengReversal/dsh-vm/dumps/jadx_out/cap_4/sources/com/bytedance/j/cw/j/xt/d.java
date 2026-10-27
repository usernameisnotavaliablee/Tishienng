package com.bytedance.j.cw.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {
    private static final int a = 0;
    private static final int b = 0;
    private static final int c = 0;
    private static final java.util.concurrent.PriorityBlockingQueue<java.lang.Runnable> d = null;
    private static final java.util.concurrent.PriorityBlockingQueue<java.lang.Runnable> e = null;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.bytedance.j.cw.j.xt.d.a = r0
            int r1 = r0 / 2
            int r1 = r1 + 1
            r2 = 4
            if (r1 >= r2) goto L13
            r1 = 4
            goto L17
        L13:
            int r1 = r0 / 2
            int r1 = r1 + 1
        L17:
            com.bytedance.j.cw.j.xt.d.b = r1
            int r1 = r0 / 2
            int r1 = r1 + 1
            if (r1 >= r2) goto L20
            goto L24
        L20:
            int r0 = r0 / 2
            int r2 = r0 + 1
        L24:
            com.bytedance.j.cw.j.xt.d.c = r2
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            com.bytedance.j.cw.j.xt.d.d = r0
            java.util.concurrent.PriorityBlockingQueue r0 = new java.util.concurrent.PriorityBlockingQueue
            r0.<init>()
            com.bytedance.j.cw.j.xt.d.e = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.concurrent.ScheduledExecutorService a() {
            com.bytedance.j.cw.j.xt.c r0 = new com.bytedance.j.cw.j.xt.c
            com.bytedance.j.cw.j.xt.xt$j r1 = com.bytedance.j.cw.j.xt.xt.j.j
            java.lang.String r2 = "tt-delay-thread-"
            r0.<init>(r1, r2)
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.sdk.component.oq.cw.cw(r0)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor b() {
            com.bytedance.sdk.component.oq.r.r r0 = new com.bytedance.sdk.component.oq.r.r
            int r1 = com.bytedance.j.cw.j.xt.d.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.PriorityBlockingQueue<java.lang.Runnable> r6 = com.bytedance.j.cw.j.xt.d.d
            com.bytedance.j.cw.j.xt.c r7 = new com.bytedance.j.cw.j.xt.c
            com.bytedance.j.cw.j.xt.xt$j r2 = com.bytedance.j.cw.j.xt.xt.j.xt
            java.lang.String r3 = "tt-api-thread-"
            r7.<init>(r2, r3)
            r3 = 1
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
    }

    public static java.util.concurrent.ThreadPoolExecutor c() {
            com.bytedance.sdk.component.oq.r.r r0 = new com.bytedance.sdk.component.oq.r.r
            int r1 = com.bytedance.j.cw.j.xt.d.c
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.PriorityBlockingQueue<java.lang.Runnable> r6 = com.bytedance.j.cw.j.xt.d.e
            com.bytedance.j.cw.j.xt.c r7 = new com.bytedance.j.cw.j.xt.c
            com.bytedance.j.cw.j.xt.xt$j r2 = com.bytedance.j.cw.j.xt.xt.j.xt
            java.lang.String r3 = "tt-default-thread-"
            r7.<init>(r2, r3)
            r3 = 1
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
    }
}
