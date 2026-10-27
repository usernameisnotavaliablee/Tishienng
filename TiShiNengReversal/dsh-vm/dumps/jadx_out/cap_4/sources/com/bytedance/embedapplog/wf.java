package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class wf<T> {
    private volatile T j;

    wf() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract T j(java.lang.Object... r1);

    public final T xt(java.lang.Object... r2) {
            r1 = this;
            T r0 = r1.j
            if (r0 != 0) goto L16
            monitor-enter(r1)
            T r0 = r1.j     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            java.lang.Object r2 = r1.j(r2)     // Catch: java.lang.Throwable -> L10
            r1.j = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
        L16:
            T r2 = r1.j
            return r2
    }
}
