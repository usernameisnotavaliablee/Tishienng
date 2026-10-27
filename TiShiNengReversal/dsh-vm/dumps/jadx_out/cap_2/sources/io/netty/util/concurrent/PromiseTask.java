package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class PromiseTask<V> extends io.netty.util.concurrent.DefaultPromise<V> implements java.util.concurrent.RunnableFuture<V> {
    protected final java.util.concurrent.Callable<V> task;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class RunnableAdapter<T> implements java.util.concurrent.Callable<T> {
        final T result;
        final java.lang.Runnable task;

        RunnableAdapter(java.lang.Runnable r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.task = r1
                r0.result = r2
                return
        }

        @Override // java.util.concurrent.Callable
        public T call() {
                r1 = this;
                java.lang.Runnable r0 = r1.task
                r0.run()
                T r0 = r1.result
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Callable(task: "
                r0.append(r1)
                java.lang.Runnable r1 = r2.task
                r0.append(r1)
                java.lang.String r1 = ", result: "
                r0.append(r1)
                T r1 = r2.result
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    PromiseTask(io.netty.util.concurrent.EventExecutor r1, java.lang.Runnable r2, V r3) {
            r0 = this;
            java.util.concurrent.Callable r2 = toCallable(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    PromiseTask(io.netty.util.concurrent.EventExecutor r1, java.util.concurrent.Callable<V> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.task = r2
            return
    }

    static <T> java.util.concurrent.Callable<T> toCallable(java.lang.Runnable r1, T r2) {
            io.netty.util.concurrent.PromiseTask$RunnableAdapter r0 = new io.netty.util.concurrent.PromiseTask$RunnableAdapter
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
            r1 = this;
            boolean r0 = r1.setUncancellableInternal()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            java.util.concurrent.Callable<V> r0 = r1.task     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L10
            r1.setSuccessInternal(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r0 = move-exception
            goto L13
        L12:
            return
        L13:
            r1.setFailureInternal(r0)
            return
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public final io.netty.util.concurrent.Promise<V> setFailure(java.lang.Throwable r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    protected final io.netty.util.concurrent.Promise<V> setFailureInternal(java.lang.Throwable r1) {
            r0 = this;
            super.setFailure(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public final io.netty.util.concurrent.Promise<V> setSuccess(V r1) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    protected final io.netty.util.concurrent.Promise<V> setSuccessInternal(V r1) {
            r0 = this;
            super.setSuccess(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise
    public final boolean setUncancellable() {
            r1 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    protected final boolean setUncancellableInternal() {
            r1 = this;
            boolean r0 = super.setUncancellable()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise
    protected java.lang.StringBuilder toStringBuilder() {
            r3 = this;
            java.lang.StringBuilder r0 = super.toStringBuilder()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r2 = 44
            r0.setCharAt(r1, r2)
            java.lang.String r1 = " task: "
            r0.append(r1)
            java.util.concurrent.Callable<V> r1 = r3.task
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise
    public final boolean tryFailure(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected final boolean tryFailureInternal(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.tryFailure(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise
    public final boolean trySuccess(V r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected final boolean trySuccessInternal(V r1) {
            r0 = this;
            boolean r1 = super.trySuccess(r1)
            return r1
    }
}
