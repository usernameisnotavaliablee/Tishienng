package com.huawei.hmf.tasks.a;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class c extends com.huawei.hmf.tasks.b {
    public final java.util.List<java.lang.Runnable> a;
    public final java.lang.Object b;
    public boolean c;

    public c() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    @Override // com.huawei.hmf.tasks.b
    public final boolean a() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // com.huawei.hmf.tasks.b
    public final com.huawei.hmf.tasks.b b(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            boolean r1 = r2.c     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r3.run()     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r3 = move-exception
            goto L14
        Ld:
            java.util.List<java.lang.Runnable> r1 = r2.a     // Catch: java.lang.Throwable -> Lb
            r1.add(r3)     // Catch: java.lang.Throwable -> Lb
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }
}
