package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class jy<T> {
    public static java.util.concurrent.Executor j;
    private final java.util.Set<com.bytedance.adsdk.lottie.oq<java.lang.Throwable>> cw;

    /* renamed from: r, reason: collision with root package name */
    private final android.os.Handler f1813r;
    private volatile com.bytedance.adsdk.lottie.vl<T> up;
    private final java.util.Set<com.bytedance.adsdk.lottie.oq<T>> xt;


    private class j extends java.util.concurrent.FutureTask<com.bytedance.adsdk.lottie.vl<T>> {
        final /* synthetic */ com.bytedance.adsdk.lottie.jy j;

        j(com.bytedance.adsdk.lottie.jy r1, java.util.concurrent.Callable<com.bytedance.adsdk.lottie.vl<T>> r2) {
                r0 = this;
                r0.j = r1
                r0.<init>(r2)
                return
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
                r3 = this;
                boolean r0 = r3.isCancelled()
                if (r0 == 0) goto L7
                return
            L7:
                com.bytedance.adsdk.lottie.jy r0 = r3.j     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
                java.lang.Object r1 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
                com.bytedance.adsdk.lottie.vl r1 = (com.bytedance.adsdk.lottie.vl) r1     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
                com.bytedance.adsdk.lottie.jy.j(r0, r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
                return
            L13:
                r0 = move-exception
                goto L16
            L15:
                r0 = move-exception
            L16:
                com.bytedance.adsdk.lottie.jy r1 = r3.j
                com.bytedance.adsdk.lottie.vl r2 = new com.bytedance.adsdk.lottie.vl
                r2.<init>(r0)
                com.bytedance.adsdk.lottie.jy.j(r1, r2)
                return
        }
    }

    static {
            com.bytedance.sdk.component.oq.oq r0 = new com.bytedance.sdk.component.oq.oq
            java.lang.String r1 = "ie/LottieTask"
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = com.bytedance.sdk.component.oq.cw.xt(r0)
            com.bytedance.adsdk.lottie.jy.j = r0
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public jy(java.util.concurrent.Callable<com.bytedance.adsdk.lottie.vl<T>> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    jy(java.util.concurrent.Callable<com.bytedance.adsdk.lottie.vl<T>> r3, boolean r4) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = 1
            r0.<init>(r1)
            r2.xt = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            r2.cw = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f1813r = r0
            r0 = 0
            r2.up = r0
            if (r4 == 0) goto L36
            java.lang.Object r3 = r3.call()     // Catch: java.lang.Throwable -> L2c
            com.bytedance.adsdk.lottie.vl r3 = (com.bytedance.adsdk.lottie.vl) r3     // Catch: java.lang.Throwable -> L2c
            r2.setResult(r3)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r3 = move-exception
            com.bytedance.adsdk.lottie.vl r4 = new com.bytedance.adsdk.lottie.vl
            r4.<init>(r3)
            r2.setResult(r4)
            return
        L36:
            java.util.concurrent.Executor r4 = com.bytedance.adsdk.lottie.jy.j
            com.bytedance.adsdk.lottie.jy$j r0 = new com.bytedance.adsdk.lottie.jy$j
            r0.<init>(r2, r3)
            r4.execute(r0)
            return
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.vl j(com.bytedance.adsdk.lottie.jy r0) {
            com.bytedance.adsdk.lottie.vl<T> r0 = r0.up
            return r0
    }

    private void j() {
            r2 = this;
            android.os.Handler r0 = r2.f1813r
            com.bytedance.adsdk.lottie.jy$1 r1 = new com.bytedance.adsdk.lottie.jy$1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.jy r0, com.bytedance.adsdk.lottie.vl r1) {
            r0.setResult(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.jy r0, java.lang.Object r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.jy r0, java.lang.Throwable r1) {
            r0.j(r1)
            return
    }

    private synchronized void j(T r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            java.util.Set<com.bytedance.adsdk.lottie.oq<T>> r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1c
            com.bytedance.adsdk.lottie.oq r1 = (com.bytedance.adsdk.lottie.oq) r1     // Catch: java.lang.Throwable -> L1c
            r1.j(r3)     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            monitor-exit(r2)
            return
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    private synchronized void j(java.lang.Throwable r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            java.util.Set<com.bytedance.adsdk.lottie.oq<java.lang.Throwable>> r1 = r2.cw     // Catch: java.lang.Throwable -> L15
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            com.bytedance.adsdk.lottie.up.up.j(r0, r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return
        L15:
            r3 = move-exception
            goto L2d
        L17:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L15
            com.bytedance.adsdk.lottie.oq r1 = (com.bytedance.adsdk.lottie.oq) r1     // Catch: java.lang.Throwable -> L15
            r1.j(r3)     // Catch: java.lang.Throwable -> L15
            goto L1b
        L2b:
            monitor-exit(r2)
            return
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    private void setResult(com.bytedance.adsdk.lottie.vl<T> r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.vl<T> r0 = r1.up
            if (r0 != 0) goto La
            r1.up = r2
            r1.j()
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "A task may only be set once."
            r2.<init>(r0)
            throw r2
    }

    public synchronized com.bytedance.adsdk.lottie.jy<T> cw(com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r3) {
            r2 = this;
            monitor-enter(r2)
            com.bytedance.adsdk.lottie.vl<T> r0 = r2.up     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.Throwable r1 = r0.xt()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            java.lang.Throwable r0 = r0.xt()     // Catch: java.lang.Throwable -> L13
            r3.j(r0)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1c
        L15:
            java.util.Set<com.bytedance.adsdk.lottie.oq<java.lang.Throwable>> r0 = r2.cw     // Catch: java.lang.Throwable -> L13
            r0.add(r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r2
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public synchronized com.bytedance.adsdk.lottie.jy<T> j(com.bytedance.adsdk.lottie.oq<T> r3) {
            r2 = this;
            monitor-enter(r2)
            com.bytedance.adsdk.lottie.vl<T> r0 = r2.up     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.Object r1 = r0.j()     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            java.lang.Object r0 = r0.j()     // Catch: java.lang.Throwable -> L13
            r3.j(r0)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L1c
        L15:
            java.util.Set<com.bytedance.adsdk.lottie.oq<T>> r0 = r2.xt     // Catch: java.lang.Throwable -> L13
            r0.add(r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return r2
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    public synchronized com.bytedance.adsdk.lottie.jy<T> r(com.bytedance.adsdk.lottie.oq<java.lang.Throwable> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.bytedance.adsdk.lottie.oq<java.lang.Throwable>> r0 = r1.cw     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r1
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized com.bytedance.adsdk.lottie.jy<T> xt(com.bytedance.adsdk.lottie.oq<T> r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<com.bytedance.adsdk.lottie.oq<T>> r0 = r1.xt     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r1
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }
}
