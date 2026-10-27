package xyz.adscope.amps.adapter.gdt.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ThreadUtils {
    private static final int CORE_POOL_SIZE = 0;
    private static final int CPU_COUNT = 0;
    private static final int TASK_QUEUE_MAX_COUNT = 128;
    private static final int THREAD_KEEP_LIVE_TIME = 30;
    public static android.os.Handler mMainHandler;
    private static java.util.concurrent.ThreadPoolExecutor mThreadPoolExecutor;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.CPU_COUNT = r0
            r1 = 2
            int r3 = java.lang.Math.max(r0, r1)
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.CORE_POOL_SIZE = r3
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 128(0x80, float:1.8E-43)
            r8.<init>(r0)
            r5 = 30
            r4 = r3
            r2.<init>(r3, r4, r5, r7, r8)
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mThreadPoolExecutor = r2
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mMainHandler = r0
            return
    }

    public ThreadUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.util.concurrent.Future<T> runOnThreadPool(java.util.concurrent.Callable<T> r1) {
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mThreadPoolExecutor
            java.util.concurrent.Future r1 = r0.submit(r1)
            return r1
    }

    public static void runOnThreadPool(java.lang.Runnable r1) {
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mThreadPoolExecutor
            r0.execute(r1)
            return
    }

    public static void runOnUIThread(java.lang.Runnable r2) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L12
            r2.run()
            return
        L12:
            android.os.Handler r0 = xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mMainHandler
            r0.post(r2)
            return
    }

    public static void runOnUIThreadByThreadPool(java.lang.Runnable r2) {
            java.util.concurrent.ThreadPoolExecutor r0 = xyz.adscope.amps.adapter.gdt.util.ThreadUtils.mThreadPoolExecutor
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils$1 r1 = new xyz.adscope.amps.adapter.gdt.util.ThreadUtils$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }
}
