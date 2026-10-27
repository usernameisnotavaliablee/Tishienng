package com.bykv.vk.component.ttvideo.player;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class AVThreadPool {
    private static java.util.concurrent.ThreadPoolExecutor mExecutorInstance;
    private static volatile java.util.concurrent.ExecutorService mExtExecutorInstance;

    public AVThreadPool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.util.concurrent.Future<java.lang.String> addTask(java.util.concurrent.Callable<java.lang.String> r2) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AVThreadPool> r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = getExecutorInstance()     // Catch: java.lang.Throwable -> Ld
            java.util.concurrent.Future r2 = r1.submit(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized void addTask(java.lang.Runnable r2) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AVThreadPool> r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.class
            monitor-enter(r0)
            java.util.concurrent.ExecutorService r1 = getExecutorInstance()     // Catch: java.lang.Throwable -> Lc
            r1.submit(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    private static synchronized java.util.concurrent.ExecutorService getExecutorInstance() {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AVThreadPool> r1 = com.bykv.vk.component.ttvideo.player.AVThreadPool.class
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.mExtExecutorInstance     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Lc
            java.util.concurrent.ExecutorService r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.mExtExecutorInstance     // Catch: java.lang.Throwable -> La
            goto L2d
        La:
            r0 = move-exception
            goto L2f
        Lc:
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.mExecutorInstance     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L2b
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> La
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> La
            r8.<init>()     // Catch: java.lang.Throwable -> La
            com.bytedance.sdk.component.oq.oq r9 = new com.bytedance.sdk.component.oq.oq     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = "/AVThreadPool"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> La
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> La
            com.bykv.vk.component.ttvideo.player.AVThreadPool.mExecutorInstance = r2     // Catch: java.lang.Throwable -> La
        L2b:
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.mExecutorInstance     // Catch: java.lang.Throwable -> La
        L2d:
            monitor-exit(r1)
            return r0
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    public static synchronized void setExecutorInstance(java.util.concurrent.ExecutorService r1) {
            java.lang.Class<com.bykv.vk.component.ttvideo.player.AVThreadPool> r0 = com.bykv.vk.component.ttvideo.player.AVThreadPool.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.player.AVThreadPool.mExtExecutorInstance = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
