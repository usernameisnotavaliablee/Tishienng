package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class a {
    private static final com.huawei.hmf.tasks.a.a b = null;
    private static final int c = 0;
    private static final int d = 0;
    private static final int e = 0;
    private final java.util.concurrent.Executor a;

    /* renamed from: com.huawei.hmf.tasks.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0025a implements java.util.concurrent.Executor {
        private ExecutorC0025a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ExecutorC0025a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r3) {
                r2 = this;
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r0.post(r3)
                return
        }
    }

    static {
            com.huawei.hmf.tasks.a.a r0 = new com.huawei.hmf.tasks.a.a
            r0.<init>()
            com.huawei.hmf.tasks.a.a.b = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.huawei.hmf.tasks.a.a.c = r0
            int r1 = r0 + 1
            com.huawei.hmf.tasks.a.a.d = r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            com.huawei.hmf.tasks.a.a.e = r0
            return
    }

    public a() {
            r2 = this;
            r2.<init>()
            com.huawei.hmf.tasks.a.a$a r0 = new com.huawei.hmf.tasks.a.a$a
            r1 = 0
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public static java.util.concurrent.ExecutorService a() {
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            int r1 = com.huawei.hmf.tasks.a.a.d
            int r2 = com.huawei.hmf.tasks.a.a.e
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r3 = 1
            r0.<init>(r1, r2, r3, r5, r6)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            return r0
    }

    public static java.util.concurrent.Executor b() {
            com.huawei.hmf.tasks.a.a r0 = com.huawei.hmf.tasks.a.a.b
            java.util.concurrent.Executor r0 = r0.a
            return r0
    }
}
