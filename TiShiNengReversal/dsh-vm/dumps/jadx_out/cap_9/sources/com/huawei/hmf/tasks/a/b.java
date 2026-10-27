package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class b<TResult> implements com.huawei.hmf.tasks.e<TResult> {
    private com.huawei.hmf.tasks.f a;
    private java.util.concurrent.Executor b;
    private final java.lang.Object c;

    final class a implements java.lang.Runnable {
        final /* synthetic */ com.huawei.hmf.tasks.a.b a;

        a(com.huawei.hmf.tasks.a.b r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.huawei.hmf.tasks.a.b r0 = r2.a
                java.lang.Object r0 = com.huawei.hmf.tasks.a.b.b(r0)
                monitor-enter(r0)
                com.huawei.hmf.tasks.a.b r1 = r2.a     // Catch: java.lang.Throwable -> L19
                com.huawei.hmf.tasks.f r1 = com.huawei.hmf.tasks.a.b.c(r1)     // Catch: java.lang.Throwable -> L19
                if (r1 == 0) goto L1b
                com.huawei.hmf.tasks.a.b r1 = r2.a     // Catch: java.lang.Throwable -> L19
                com.huawei.hmf.tasks.f r1 = com.huawei.hmf.tasks.a.b.c(r1)     // Catch: java.lang.Throwable -> L19
                r1.onCanceled()     // Catch: java.lang.Throwable -> L19
                goto L1b
            L19:
                r1 = move-exception
                goto L1d
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L1d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1
        }
    }

    b(java.util.concurrent.Executor r2, com.huawei.hmf.tasks.f r3) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            r1.a = r3
            r1.b = r2
            return
    }

    static /* synthetic */ java.lang.Object b(com.huawei.hmf.tasks.a.b r0) {
            java.lang.Object r0 = r0.c
            return r0
    }

    static /* synthetic */ com.huawei.hmf.tasks.f c(com.huawei.hmf.tasks.a.b r0) {
            com.huawei.hmf.tasks.f r0 = r0.a
            return r0
    }

    @Override // com.huawei.hmf.tasks.e
    public final void a(com.huawei.hmf.tasks.k<TResult> r2) {
            r1 = this;
            boolean r2 = r2.t()
            if (r2 == 0) goto L10
            java.util.concurrent.Executor r2 = r1.b
            com.huawei.hmf.tasks.a.b$a r0 = new com.huawei.hmf.tasks.a.b$a
            r0.<init>(r1)
            r2.execute(r0)
        L10:
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
