package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EngineThreadPool {
    private static java.util.concurrent.ThreadPoolExecutor a;

    public EngineThreadPool() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ExecutorService a() {
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a
            if (r0 != 0) goto L2f
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.EngineThreadPool> r1 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.class
            monitor-enter(r1)
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L2b
            com.bytedance.sdk.component.oq.r.r r2 = new com.bytedance.sdk.component.oq.r.r     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L29
            r8.<init>()     // Catch: java.lang.Throwable -> L29
            com.bytedance.sdk.component.oq.oq r9 = new com.bytedance.sdk.component.oq.oq     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "EngineThreadPool"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L29
            r3 = 5
            r4 = 5
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L29
            com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a = r2     // Catch: java.lang.Throwable -> L29
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r0
        L2f:
            java.util.concurrent.ThreadPoolExecutor r0 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a
            return r0
    }

    public static void setExcutorInstance(java.util.concurrent.ThreadPoolExecutor r1) {
            java.lang.Class<com.bykv.vk.component.ttvideo.utils.EngineThreadPool> r0 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.class
            monitor-enter(r0)
            com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a = r1     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
