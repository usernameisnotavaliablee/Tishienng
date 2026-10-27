package com.huawei.hmf.tasks;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class n {
    private static com.huawei.hmf.tasks.a.j a;

    static {
            com.huawei.hmf.tasks.a.j r0 = new com.huawei.hmf.tasks.a.j
            r0.<init>()
            com.huawei.hmf.tasks.n.a = r0
            return
    }

    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hmf.tasks.k<java.util.List<com.huawei.hmf.tasks.k<?>>> a(java.util.Collection<? extends com.huawei.hmf.tasks.k<?>> r0) {
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.b(r0)
            return r0
    }

    public static com.huawei.hmf.tasks.k<java.util.List<com.huawei.hmf.tasks.k<?>>> b(com.huawei.hmf.tasks.k<?>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.b(r0)
            return r0
    }

    public static <TResult> TResult c(com.huawei.hmf.tasks.k<TResult> r2) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            java.lang.String r0 = "await must not be called on the UI thread"
            com.huawei.hmf.tasks.a.j.e(r0)
            boolean r0 = r2.u()
            if (r0 == 0) goto L10
            java.lang.Object r2 = com.huawei.hmf.tasks.a.j.d(r2)
            return r2
        L10:
            com.huawei.hmf.tasks.a.j$d r0 = new com.huawei.hmf.tasks.a.j$d
            r0.<init>()
            com.huawei.hmf.tasks.k r1 = r2.k(r0)
            r1.h(r0)
            java.util.concurrent.CountDownLatch r0 = r0.a
            r0.await()
            java.lang.Object r2 = com.huawei.hmf.tasks.a.j.d(r2)
            return r2
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> call(java.util.concurrent.Callable<TResult> r2) {
            com.huawei.hmf.tasks.a.j r0 = com.huawei.hmf.tasks.n.a
            java.util.concurrent.Executor r1 = com.huawei.hmf.tasks.m.b()
            com.huawei.hmf.tasks.k r2 = r0.c(r1, r2)
            return r2
    }

    public static <TResult> TResult d(com.huawei.hmf.tasks.k<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            java.lang.String r0 = "await must not be called on the UI thread"
            com.huawei.hmf.tasks.a.j.e(r0)
            boolean r0 = r2.u()
            if (r0 != 0) goto L28
            com.huawei.hmf.tasks.a.j$d r0 = new com.huawei.hmf.tasks.a.j$d
            r0.<init>()
            com.huawei.hmf.tasks.k r1 = r2.k(r0)
            r1.h(r0)
            java.util.concurrent.CountDownLatch r0 = r0.a
            boolean r3 = r0.await(r3, r5)
            if (r3 == 0) goto L20
            goto L28
        L20:
            java.util.concurrent.TimeoutException r2 = new java.util.concurrent.TimeoutException
            java.lang.String r3 = "Timed out waiting for Task"
            r2.<init>(r3)
            throw r2
        L28:
            java.lang.Object r2 = com.huawei.hmf.tasks.a.j.d(r2)
            return r2
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> e(java.util.concurrent.Callable<TResult> r2) {
            com.huawei.hmf.tasks.a.j r0 = com.huawei.hmf.tasks.n.a
            java.util.concurrent.ExecutorService r1 = com.huawei.hmf.tasks.m.a()
            com.huawei.hmf.tasks.k r2 = r0.c(r1, r2)
            return r2
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> f(java.util.concurrent.Executor r1, java.util.concurrent.Callable<TResult> r2) {
            com.huawei.hmf.tasks.a.j r0 = com.huawei.hmf.tasks.n.a
            com.huawei.hmf.tasks.k r1 = r0.c(r1, r2)
            return r1
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> g() {
            com.huawei.hmf.tasks.a.i r0 = new com.huawei.hmf.tasks.a.i
            r0.<init>()
            r0.B()
            return r0
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> h(java.lang.Exception r1) {
            com.huawei.hmf.tasks.l r0 = new com.huawei.hmf.tasks.l
            r0.<init>()
            r0.c(r1)
            com.huawei.hmf.tasks.k r1 = r0.b()
            return r1
    }

    public static <TResult> com.huawei.hmf.tasks.k<TResult> i(TResult r0) {
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.a(r0)
            return r0
    }

    public static com.huawei.hmf.tasks.k<java.lang.Void> j(java.util.Collection<? extends com.huawei.hmf.tasks.k<?>> r0) {
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.g(r0)
            return r0
    }

    public static com.huawei.hmf.tasks.k<java.lang.Void> k(com.huawei.hmf.tasks.k<?>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.g(r0)
            return r0
    }

    public static <TResult> com.huawei.hmf.tasks.k<java.util.List<TResult>> l(java.util.Collection<? extends com.huawei.hmf.tasks.k<TResult>> r0) {
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.f(r0)
            return r0
    }

    public static <TResult> com.huawei.hmf.tasks.k<java.util.List<TResult>> m(com.huawei.hmf.tasks.k<?>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.huawei.hmf.tasks.k r0 = com.huawei.hmf.tasks.a.j.f(r0)
            return r0
    }
}
