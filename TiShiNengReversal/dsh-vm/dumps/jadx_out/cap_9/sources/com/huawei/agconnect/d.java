package com.huawei.agconnect;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.agconnect.d a(com.huawei.agconnect.e r0) {
            com.huawei.agconnect.d r0 = com.huawei.agconnect.core.a.b.i(r0)
            return r0
    }

    public static com.huawei.agconnect.d b() {
            com.huawei.agconnect.d r0 = com.huawei.agconnect.core.a.b.h()
            return r0
    }

    public static com.huawei.agconnect.d c(java.lang.String r0) {
            com.huawei.agconnect.d r0 = com.huawei.agconnect.core.a.b.k(r0)
            return r0
    }

    public static synchronized void f(android.content.Context r1) {
            java.lang.Class<com.huawei.agconnect.d> r0 = com.huawei.agconnect.d.class
            monitor-enter(r0)
            com.huawei.agconnect.core.a.b.l(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public static synchronized void g(android.content.Context r1, com.huawei.agconnect.f r2) {
            java.lang.Class<com.huawei.agconnect.d> r0 = com.huawei.agconnect.d.class
            monitor-enter(r0)
            com.huawei.agconnect.core.a.b.n(r1, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    public abstract com.huawei.agconnect.e d();

    public abstract <T> T e(java.lang.Class<? super T> r1);

    public abstract android.content.Context getContext();

    public abstract java.lang.String getIdentifier();
}
