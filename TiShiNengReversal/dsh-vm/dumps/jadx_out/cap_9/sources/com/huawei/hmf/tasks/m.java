package com.huawei.hmf.tasks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class m {
    private static final com.huawei.hmf.tasks.m d = null;
    private final java.util.concurrent.Executor a;
    private final java.util.concurrent.ExecutorService b;
    private final java.util.concurrent.Executor c;

    static final class a implements java.util.concurrent.Executor {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r1) {
                r0 = this;
                r1.run()
                return
        }
    }

    static {
            com.huawei.hmf.tasks.m r0 = new com.huawei.hmf.tasks.m
            r0.<init>()
            com.huawei.hmf.tasks.m.d = r0
            return
    }

    private m() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = com.huawei.hmf.tasks.a.a.a()
            r1.b = r0
            com.huawei.hmf.tasks.m$a r0 = new com.huawei.hmf.tasks.m$a
            r0.<init>()
            r1.a = r0
            java.util.concurrent.Executor r0 = com.huawei.hmf.tasks.a.a.b()
            r1.c = r0
            return
    }

    static java.util.concurrent.ExecutorService a() {
            com.huawei.hmf.tasks.m r0 = com.huawei.hmf.tasks.m.d
            java.util.concurrent.ExecutorService r0 = r0.b
            return r0
    }

    public static java.util.concurrent.Executor b() {
            com.huawei.hmf.tasks.m r0 = com.huawei.hmf.tasks.m.d
            java.util.concurrent.Executor r0 = r0.a
            return r0
    }

    public static java.util.concurrent.Executor c() {
            com.huawei.hmf.tasks.m r0 = com.huawei.hmf.tasks.m.d
            java.util.concurrent.Executor r0 = r0.c
            return r0
    }
}
