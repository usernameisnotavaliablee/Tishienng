package com.huawei.hmf.tasks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c {
    private com.huawei.hmf.tasks.a.c a;

    public c() {
            r1 = this;
            r1.<init>()
            com.huawei.hmf.tasks.a.c r0 = new com.huawei.hmf.tasks.a.c
            r0.<init>()
            r1.a = r0
            return
    }

    public void a() {
            r3 = this;
            com.huawei.hmf.tasks.a.c r0 = r3.a
            boolean r1 = r0.c
            if (r1 != 0) goto L28
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            r2 = 1
            r0.c = r2     // Catch: java.lang.Throwable -> L22
            java.util.List<java.lang.Runnable> r0 = r0.a     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L22
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L22
            r2.run()     // Catch: java.lang.Throwable -> L22
            goto L12
        L22:
            r0 = move-exception
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r0
        L28:
            return
    }

    public com.huawei.hmf.tasks.b b() {
            r1 = this;
            com.huawei.hmf.tasks.a.c r0 = r1.a
            return r0
    }
}
