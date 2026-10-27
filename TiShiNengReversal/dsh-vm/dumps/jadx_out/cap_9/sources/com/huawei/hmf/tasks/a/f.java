package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class f<TResult> implements com.huawei.hmf.tasks.e<TResult> {
    private com.huawei.hmf.tasks.h a;
    private java.util.concurrent.Executor b;
    private final java.lang.Object c;

    final class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hmf.tasks.k a;
        final /* synthetic */ com.huawei.hmf.tasks.a.f b;

        a(com.huawei.hmf.tasks.a.f r1, com.huawei.hmf.tasks.k r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                com.huawei.hmf.tasks.a.f r0 = r3.b
                java.lang.Object r0 = com.huawei.hmf.tasks.a.f.b(r0)
                monitor-enter(r0)
                com.huawei.hmf.tasks.a.f r1 = r3.b     // Catch: java.lang.Throwable -> L1f
                com.huawei.hmf.tasks.h r1 = com.huawei.hmf.tasks.a.f.c(r1)     // Catch: java.lang.Throwable -> L1f
                if (r1 == 0) goto L21
                com.huawei.hmf.tasks.a.f r1 = r3.b     // Catch: java.lang.Throwable -> L1f
                com.huawei.hmf.tasks.h r1 = com.huawei.hmf.tasks.a.f.c(r1)     // Catch: java.lang.Throwable -> L1f
                com.huawei.hmf.tasks.k r2 = r3.a     // Catch: java.lang.Throwable -> L1f
                java.lang.Exception r2 = r2.q()     // Catch: java.lang.Throwable -> L1f
                r1.onFailure(r2)     // Catch: java.lang.Throwable -> L1f
                goto L21
            L1f:
                r1 = move-exception
                goto L23
            L21:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                return
            L23:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
                throw r1
        }
    }

    f(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.h r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            r1.a = r3
            r1.b = r2
            return
    }

    static /* synthetic */ java.lang.Object b(com.huawei.hmf.tasks.a.f r0) {
            java.lang.Object r0 = r0.c
            return r0
    }

    static /* synthetic */ com.huawei.hmf.tasks.h c(com.huawei.hmf.tasks.a.f r0) {
            com.huawei.hmf.tasks.h r0 = r0.a
            return r0
    }

    @Override // com.huawei.hmf.tasks.e
    public final void a(com.huawei.hmf.tasks.k<TResult> r3) {
            r2 = this;
            boolean r0 = r3.v()
            if (r0 != 0) goto L16
            boolean r0 = r3.t()
            if (r0 != 0) goto L16
            java.util.concurrent.Executor r0 = r2.b
            com.huawei.hmf.tasks.a.f$a r1 = new com.huawei.hmf.tasks.a.f$a
            r1.<init>(r2, r3)
            r0.execute(r1)
        L16:
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
