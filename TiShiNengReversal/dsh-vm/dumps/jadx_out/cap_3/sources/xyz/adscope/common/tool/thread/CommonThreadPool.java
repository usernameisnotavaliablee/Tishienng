package xyz.adscope.common.tool.thread;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CommonThreadPool {
    private static final int a = 0;
    private static final int b = 0;
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> c = null;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            xyz.adscope.common.tool.thread.CommonThreadPool.a = r0
            int r0 = r0 / 2
            int r0 = r0 + 1
            r1 = 4
            int r0 = java.lang.Math.max(r0, r1)
            xyz.adscope.common.tool.thread.CommonThreadPool.b = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            xyz.adscope.common.tool.thread.CommonThreadPool.c = r0
            return
    }

    public CommonThreadPool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ThreadPoolExecutor getInitRequestPool() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r2 = xyz.adscope.common.tool.thread.CommonThreadPool.b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = xyz.adscope.common.tool.thread.CommonThreadPool.c
            xyz.adscope.common.tool.thread.CommonThreadFactory r7 = new xyz.adscope.common.tool.thread.CommonThreadFactory
            r1 = 5
            java.lang.String r3 = "common-adsdk-adrequest-thread-"
            r7.<init>(r1, r3)
            java.util.concurrent.RejectedExecutionHandler r8 = rejectHandler()
            r1 = 2
            r3 = 5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public static java.util.concurrent.ScheduledExecutorService getScheduledExecutorService() {
            r0 = 3
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            return r0
    }

    public static java.util.concurrent.ScheduledExecutorService getSingleExecutorService() {
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            return r0
    }

    public static java.util.concurrent.RejectedExecutionHandler rejectHandler() {
            xyz.adscope.common.tool.thread.CommonThreadPool$1 r0 = new xyz.adscope.common.tool.thread.CommonThreadPool$1
            r0.<init>()
            return r0
    }
}
