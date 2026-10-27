package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExecutorsUtils {
    private static final java.lang.String a = "NetworkKit_";


    public ExecutorsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.ThreadFactory createThreadFactory(java.lang.String r1) {
            if (r1 == 0) goto L12
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            com.huawei.hms.framework.common.ExecutorsUtils$1 r0 = new com.huawei.hms.framework.common.ExecutorsUtils$1
            r0.<init>(r1)
            return r0
        L12:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "ThreadName is empty"
            r1.<init>(r0)
            throw r1
    }

    public static java.util.concurrent.ExecutorService newCachedThreadPool(java.lang.String r8) {
            java.util.concurrent.ThreadFactory r7 = createThreadFactory(r8)
            com.huawei.hms.framework.common.ThreadPoolExcutorEnhance r0 = new com.huawei.hms.framework.common.ThreadPoolExcutorEnhance
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r6 = new java.util.concurrent.SynchronousQueue
            r6.<init>()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 60
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            return r0
    }

    public static java.util.concurrent.ExecutorService newFixedThreadPool(int r8, java.lang.String r9) {
            java.util.concurrent.ThreadFactory r7 = createThreadFactory(r9)
            com.huawei.hms.framework.common.ThreadPoolExcutorEnhance r0 = new com.huawei.hms.framework.common.ThreadPoolExcutorEnhance
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r3 = 60
            r2 = r8
            r1 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8 = 1
            r0.allowCoreThreadTimeOut(r8)
            return r0
    }

    public static java.util.concurrent.ScheduledExecutorService newScheduledThreadPool(int r1, java.lang.String r2) {
            java.util.concurrent.ThreadFactory r2 = createThreadFactory(r2)
            com.huawei.hms.framework.common.ScheduledThreadPoolExecutorEnhance r0 = new com.huawei.hms.framework.common.ScheduledThreadPoolExecutorEnhance
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.lang.String r0) {
            java.util.concurrent.ThreadFactory r0 = createThreadFactory(r0)
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.framework.common.ExecutorsEnhance.newSingleThreadExecutor(r0)
            return r0
    }

    public static java.lang.Thread newThread(java.lang.Runnable r3, java.lang.String r4) {
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NetworkKit_"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r3, r4)
            return r0
    }
}
