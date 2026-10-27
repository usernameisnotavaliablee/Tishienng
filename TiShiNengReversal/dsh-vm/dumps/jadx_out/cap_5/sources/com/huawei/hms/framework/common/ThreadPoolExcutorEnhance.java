package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ThreadPoolExcutorEnhance extends java.util.concurrent.ThreadPoolExecutor {
    public ThreadPoolExcutorEnhance(int r10, int r11, int r12, java.util.concurrent.TimeUnit r13, java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r14, java.util.concurrent.ThreadFactory r15, java.util.concurrent.RejectedExecutionHandler r16) {
            r9 = this;
            long r3 = (long) r12
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public ThreadPoolExcutorEnhance(int r1, int r2, long r3, java.util.concurrent.TimeUnit r5, java.util.concurrent.BlockingQueue<java.lang.Runnable> r6, java.util.concurrent.ThreadFactory r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(java.lang.Thread r6, java.lang.Runnable r7) {
            r5 = this;
            boolean r0 = r7 instanceof com.huawei.hms.framework.common.RunnableEnhance
            if (r0 == 0) goto L3f
            r0 = r7
            com.huawei.hms.framework.common.RunnableEnhance r0 = (com.huawei.hms.framework.common.RunnableEnhance) r0
            java.lang.String r0 = r0.getParentName()
            java.lang.String r1 = " -->"
            int r2 = r0.lastIndexOf(r1)
            r3 = -1
            if (r2 == r3) goto L1a
            int r2 = r2 + 4
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.substring(r0, r2)
        L1a:
            java.lang.String r2 = r6.getName()
            int r4 = r2.lastIndexOf(r1)
            if (r4 == r3) goto L2a
            int r4 = r4 + 4
            java.lang.String r2 = com.huawei.hms.framework.common.StringUtils.substring(r2, r4)
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r6.setName(r0)
        L3f:
            super.beforeExecute(r6, r7)
            return
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            com.huawei.hms.framework.common.RunnableEnhance r0 = new com.huawei.hms.framework.common.RunnableEnhance
            r0.<init>(r2)
            super.execute(r0)
            return
    }
}
