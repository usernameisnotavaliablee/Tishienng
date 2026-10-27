package xyz.adscope.amps.tool.thread;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSThreadPool {
    private static final int CORE_NUM = 0;
    private static final int MAX_NUM = 0;
    private static final int UPDATE_THREAD_COUNT = 3;
    private static java.util.concurrent.ScheduledExecutorService executorService;
    private static final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> initRequestQueue = null;
    private static java.util.concurrent.ThreadPoolExecutor mInitRequestPool;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            xyz.adscope.amps.tool.thread.AMPSThreadPool.CORE_NUM = r0
            int r0 = r0 / 2
            int r0 = r0 + 1
            r1 = 4
            int r0 = java.lang.Math.max(r0, r1)
            xyz.adscope.amps.tool.thread.AMPSThreadPool.MAX_NUM = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            xyz.adscope.amps.tool.thread.AMPSThreadPool.initRequestQueue = r0
            return
    }

    public AMPSThreadPool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ThreadPoolExecutor getInitRequestPool() {
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.mInitRequestPool
            if (r0 != 0) goto L20
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            int r3 = xyz.adscope.amps.tool.thread.AMPSThreadPool.MAX_NUM
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r7 = xyz.adscope.amps.tool.thread.AMPSThreadPool.initRequestQueue
            xyz.adscope.amps.tool.thread.AMPSThreadFactory r8 = new xyz.adscope.amps.tool.thread.AMPSThreadFactory
            r0 = 5
            java.lang.String r2 = "adscope-adsdk-adrequest-thread-"
            r8.<init>(r0, r2)
            java.util.concurrent.RejectedExecutionHandler r9 = rejectHandler()
            r2 = 2
            r4 = 5
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            xyz.adscope.amps.tool.thread.AMPSThreadPool.mInitRequestPool = r1
        L20:
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.mInitRequestPool
            return r0
    }

    public static java.util.concurrent.ScheduledExecutorService getScheduledExecutorService() {
            r0 = 3
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            return r0
    }

    public static java.util.concurrent.ScheduledExecutorService getSingleExecutorService() {
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.executorService
            if (r0 != 0) goto La
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            xyz.adscope.amps.tool.thread.AMPSThreadPool.executorService = r0
        La:
            java.util.concurrent.ScheduledExecutorService r0 = xyz.adscope.amps.tool.thread.AMPSThreadPool.executorService
            return r0
    }

    public static java.util.concurrent.RejectedExecutionHandler rejectHandler() {
            xyz.adscope.amps.tool.thread.AMPSThreadPool$1 r0 = new xyz.adscope.amps.tool.thread.AMPSThreadPool$1
            r0.<init>()
            return r0
    }
}
