package io.reactivex.internal.schedulers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ScheduledRunnable extends java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> implements java.lang.Runnable, java.util.concurrent.Callable<java.lang.Object>, io.reactivex.disposables.Disposable {
    static final java.lang.Object DISPOSED = null;
    static final java.lang.Object DONE = null;
    static final int FUTURE_INDEX = 1;
    static final int PARENT_INDEX = 0;
    private static final long serialVersionUID = -6120223772001106981L;
    final java.lang.Runnable actual;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.reactivex.internal.schedulers.ScheduledRunnable.DONE = r0
            return
    }

    public ScheduledRunnable(java.lang.Runnable r2, io.reactivex.internal.disposables.DisposableContainer r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r1.actual = r2
            r2 = 0
            r1.lazySet(r2, r3)
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
            r1 = this;
            r1.run()
            r0 = 0
            return r0
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r3 = this;
        L0:
            r0 = 1
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 == r2) goto L1b
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 != r2) goto Le
            goto L1b
        Le:
            boolean r2 = r3.compareAndSet(r0, r1, r2)
            if (r2 == 0) goto L0
            if (r1 == 0) goto L1b
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r0)
        L1b:
            r0 = 0
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 == r2) goto L36
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 == r2) goto L36
            if (r1 != 0) goto L2b
            goto L36
        L2b:
            boolean r0 = r3.compareAndSet(r0, r1, r2)
            if (r0 == 0) goto L1b
            io.reactivex.internal.disposables.DisposableContainer r1 = (io.reactivex.internal.disposables.DisposableContainer) r1
            r1.delete(r3)
        L36:
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r3 = this;
            r0 = 1
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 == r2) goto Lf
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 != r2) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            r0 = 1
            r1 = 0
            java.lang.Runnable r2 = r5.actual     // Catch: java.lang.Throwable -> L8
            r2.run()     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            r2 = move-exception
            io.reactivex.plugins.RxJavaPlugins.onError(r2)     // Catch: java.lang.Throwable -> L34
        Lc:
            java.lang.Object r2 = r5.get(r1)
            java.lang.Object r3 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r2 == r3) goto L23
            if (r2 == 0) goto L23
            java.lang.Object r3 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r1, r2, r3)
            if (r1 == 0) goto L23
            io.reactivex.internal.disposables.DisposableContainer r2 = (io.reactivex.internal.disposables.DisposableContainer) r2
            r2.delete(r5)
        L23:
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 == r2) goto L33
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r0, r1, r2)
            if (r1 == 0) goto L23
        L33:
            return
        L34:
            r2 = move-exception
            java.lang.Object r3 = r5.get(r1)
            java.lang.Object r4 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r3 == r4) goto L4c
            if (r3 == 0) goto L4c
            java.lang.Object r4 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r1, r3, r4)
            if (r1 == 0) goto L4c
            io.reactivex.internal.disposables.DisposableContainer r3 = (io.reactivex.internal.disposables.DisposableContainer) r3
            r3.delete(r5)
        L4c:
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r3 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 == r3) goto L5d
            java.lang.Object r3 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            boolean r1 = r5.compareAndSet(r0, r1, r3)
            if (r1 != 0) goto L5d
            goto L4c
        L5d:
            throw r2
    }

    public void setFuture(java.util.concurrent.Future<?> r4) {
            r3 = this;
        L0:
            r0 = 1
            java.lang.Object r1 = r3.get(r0)
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            if (r1 != r2) goto La
            goto L18
        La:
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DISPOSED
            if (r1 != r2) goto L12
            r4.cancel(r0)
            return
        L12:
            boolean r0 = r3.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L0
        L18:
            return
    }
}
