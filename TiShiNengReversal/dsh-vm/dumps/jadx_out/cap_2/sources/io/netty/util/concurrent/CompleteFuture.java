package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class CompleteFuture<V> extends io.netty.util.concurrent.AbstractFuture<V> {
    private final io.netty.util.concurrent.EventExecutor executor;

    protected CompleteFuture(io.netty.util.concurrent.EventExecutor r1) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            return
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r2) {
            r1 = this;
            if (r2 == 0) goto La
            io.netty.util.concurrent.EventExecutor r0 = r1.executor()
            io.netty.util.concurrent.DefaultPromise.notifyListener(r0, r1, r2)
            return r1
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "listener"
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r5) {
            r4 = this;
            if (r5 == 0) goto L16
            int r0 = r5.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            if (r2 != 0) goto Lb
            goto L15
        Lb:
            io.netty.util.concurrent.EventExecutor r3 = r4.executor()
            io.netty.util.concurrent.DefaultPromise.notifyListener(r3, r4, r2)
            int r1 = r1 + 1
            goto L4
        L15:
            return r4
        L16:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "listeners"
            r5.<init>(r0)
            throw r5
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> await() throws java.lang.InterruptedException {
            r1 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long r1) throws java.lang.InterruptedException {
            r0 = this;
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException {
            r0 = this;
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> awaitUninterruptibly() {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isCancellable() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1) {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> sync() throws java.lang.InterruptedException {
            r0 = this;
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Future<V> syncUninterruptibly() {
            r0 = this;
            return r0
    }
}
