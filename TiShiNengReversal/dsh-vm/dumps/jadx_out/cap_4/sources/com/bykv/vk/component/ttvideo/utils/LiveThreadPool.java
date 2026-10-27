package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveThreadPool {
    private static final java.lang.String TAG = "LiveThreadPool";
    private static final int THREADPOOL_MAX_RUNNING_TASK_SIZE = 5;
    private static volatile java.util.concurrent.ThreadPoolExecutor mExecutorInstance;
    private static java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool.AsyncRunnable> mReadyRunnables;
    private static java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool.AsyncRunnable> mRunningRunnables;

    public static class AsyncRunnable implements java.lang.Runnable {
        private java.lang.Runnable mRunnable;

        public AsyncRunnable(java.lang.Runnable r1) {
                r0 = this;
                r0.<init>()
                r0.mRunnable = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.mRunnable
                r0.run()
                com.bykv.vk.component.ttvideo.utils.LiveThreadPool.access$000(r1)
                return
        }
    }

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mReadyRunnables = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mRunningRunnables = r0
            return
    }

    public LiveThreadPool() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized void _finished(com.bykv.vk.component.ttvideo.utils.LiveThreadPool.AsyncRunnable r2) {
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.LiveThreadPool> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.class
            monitor-enter(r0)
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r1 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mRunningRunnables     // Catch: java.lang.Throwable -> Ld
            r1.remove(r2)     // Catch: java.lang.Throwable -> Ld
            _promoteRunnable()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    private static void _promoteRunnable() {
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mReadyRunnables
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mReadyRunnables
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable r1 = (com.bykv.vk.component.ttvideo.utils.LiveThreadPool.AsyncRunnable) r1
            r0.remove()
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mRunningRunnables
            r0.add(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            r0.execute(r1)
        L27:
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.utils.LiveThreadPool.AsyncRunnable r0) {
            _finished(r0)
            return
    }

    public static synchronized java.util.concurrent.Future addExecuteTask(java.lang.Runnable r4) {
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.LiveThreadPool> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.class
            monitor-enter(r0)
            r1 = 0
            if (r4 != 0) goto L8
            monitor-exit(r0)
            return r1
        L8:
            java.util.concurrent.ThreadPoolExecutor r2 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L12
            getExecutorInstance()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L37
        L12:
            getPoolSize()     // Catch: java.lang.Throwable -> L10
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable r2 = new com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable     // Catch: java.lang.Throwable -> L10
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L10
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r4 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mRunningRunnables     // Catch: java.lang.Throwable -> L10
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L10
            r3 = 5
            if (r4 < r3) goto L2a
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r4 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mReadyRunnables     // Catch: java.lang.Throwable -> L10
            r4.add(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r1
        L2a:
            java.util.Deque<com.bykv.vk.component.ttvideo.utils.LiveThreadPool$AsyncRunnable> r4 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mRunningRunnables     // Catch: java.lang.Throwable -> L10
            r4.add(r2)     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.ThreadPoolExecutor r4 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.Future r4 = r4.submit(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return r4
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r4
    }

    public static java.util.concurrent.ThreadPoolExecutor getExecutorInstance() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            if (r0 != 0) goto L2d
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.LiveThreadPool> r1 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.class
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L29
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L27
            r8.<init>()     // Catch: java.lang.Throwable -> L27
            com.bytedance.sdk.component.oq.oq r9 = new com.bytedance.sdk.component.oq.oq     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "iveThreadPool"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance = r2     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            goto L2d
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r0
        L2d:
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            return r0
    }

    public static int getPoolSize() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            if (r0 != 0) goto L7
            getExecutorInstance()
        L7:
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            int r0 = r0.getPoolSize()
            return r0
    }

    public static void setExecutorInstance(java.util.concurrent.ThreadPoolExecutor r1) {
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.LiveThreadPool> r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void shutdown() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            if (r0 == 0) goto L9
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.LiveThreadPool.mExecutorInstance
            r0.shutdown()
        L9:
            return
    }
}
