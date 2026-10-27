package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class d<TResult> implements com.huawei.hmf.tasks.e<TResult> {
    private com.huawei.hmf.tasks.g<TResult> a;
    java.util.concurrent.Executor b;
    private final java.lang.Object c;

    final class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hmf.tasks.k a;
        final /* synthetic */ com.huawei.hmf.tasks.a.d b;

        a(com.huawei.hmf.tasks.a.d r1, com.huawei.hmf.tasks.k r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.huawei.hmf.tasks.a.d r0 = r3.b
                java.lang.Object r0 = com.huawei.hmf.tasks.a.d.b(r0)
                monitor-enter(r0)
                com.huawei.hmf.tasks.a.d r1 = r3.b     // Catch: java.lang.Throwable -> L1b
                com.huawei.hmf.tasks.g r1 = com.huawei.hmf.tasks.a.d.c(r1)     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L1d
                com.huawei.hmf.tasks.a.d r1 = r3.b     // Catch: java.lang.Throwable -> L1b
                com.huawei.hmf.tasks.g r1 = com.huawei.hmf.tasks.a.d.c(r1)     // Catch: java.lang.Throwable -> L1b
                com.huawei.hmf.tasks.k r2 = r3.a     // Catch: java.lang.Throwable -> L1b
                r1.a(r2)     // Catch: java.lang.Throwable -> L1b
                goto L1d
            L1b:
                r1 = move-exception
                goto L1f
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                return
            L1f:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r1
        }
    }

    d(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.g<TResult> r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            r1.a = r3
            r1.b = r2
            return
    }

    static /* synthetic */ java.lang.Object b(com.huawei.hmf.tasks.a.d r0) {
            java.lang.Object r0 = r0.c
            return r0
    }

    static /* synthetic */ com.huawei.hmf.tasks.g c(com.huawei.hmf.tasks.a.d r0) {
            com.huawei.hmf.tasks.g<TResult> r0 = r0.a
            return r0
    }

    @Override // com.huawei.hmf.tasks.e
    public final void a(com.huawei.hmf.tasks.k<TResult> r3) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.b
            com.huawei.hmf.tasks.a.d$a r1 = new com.huawei.hmf.tasks.a.d$a
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            r1 = 0
            r2.a = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }
}
