package xyz.adscope.common.network.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class WorkExecutor implements java.util.concurrent.Executor {
    private static final int b = 0;
    private static final java.util.concurrent.ThreadFactory c = null;
    private java.util.concurrent.ThreadPoolExecutor a;



    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            xyz.adscope.common.network.util.WorkExecutor.b = r0
            xyz.adscope.common.network.util.WorkExecutor$1 r0 = new xyz.adscope.common.network.util.WorkExecutor$1
            r0.<init>()
            xyz.adscope.common.network.util.WorkExecutor.c = r0
            return
    }

    public WorkExecutor() {
            r11 = this;
            r11.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r1 = xyz.adscope.common.network.util.WorkExecutor.b
            int r2 = r1 + (-1)
            r3 = 4
            int r2 = java.lang.Math.min(r2, r3)
            r3 = 2
            int r2 = java.lang.Math.max(r3, r2)
            int r1 = r1 * 2
            r9 = 1
            int r1 = r1 + r9
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r3 = 200(0xc8, float:2.8E-43)
            r6.<init>(r3)
            java.util.concurrent.ThreadFactory r7 = xyz.adscope.common.network.util.WorkExecutor.c
            java.util.concurrent.RejectedExecutionHandler r8 = r11.rejectHandler()
            r3 = 60
            r10 = r2
            r2 = r1
            r1 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r11.a = r0
            r0.allowCoreThreadTimeOut(r9)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.a
            r0.execute(r2)
            return
    }

    public java.util.concurrent.RejectedExecutionHandler rejectHandler() {
            r1 = this;
            xyz.adscope.common.network.util.WorkExecutor$2 r0 = new xyz.adscope.common.network.util.WorkExecutor$2
            r0.<init>(r1)
            return r0
    }
}
