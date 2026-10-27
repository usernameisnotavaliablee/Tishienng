package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultProgressivePromise<V> extends io.netty.util.concurrent.DefaultPromise<V> implements io.netty.util.concurrent.ProgressivePromise<V> {
    protected DefaultProgressivePromise() {
            r0 = this;
            r0.<init>()
            return
    }

    public DefaultProgressivePromise(io.netty.util.concurrent.EventExecutor r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1) {
            r0 = this;
            super.addListener(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1) {
            r0 = this;
            super.addListeners(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> await() throws java.lang.InterruptedException {
            r0 = this;
            super.await()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future awaitUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> awaitUninterruptibly() {
            r0 = this;
            super.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise awaitUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r1) {
            r0 = this;
            super.removeListener(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r1) {
            r0 = this;
            super.removeListeners(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public io.netty.util.concurrent.ProgressivePromise<V> setFailure(java.lang.Throwable r1) {
            r0 = this;
            super.setFailure(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.setFailure(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.ProgressivePromise
    public io.netty.util.concurrent.ProgressivePromise<V> setProgress(long r5, long r7) {
            r4 = this;
            java.lang.String r0 = "progress: "
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L29
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto Lf
            r7 = -1
            goto L31
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r5)
            java.lang.String r5 = " (expected: >= 0)"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            throw r7
        L29:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L43
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L43
        L31:
            boolean r0 = r4.isDone()
            if (r0 != 0) goto L3b
            r4.notifyProgressiveListeners(r5, r7)
            return r4
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "complete already"
            r5.<init>(r6)
            throw r5
        L43:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = " (expected: 0 <= progress <= total ("
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = "))"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public io.netty.util.concurrent.ProgressivePromise<V> setSuccess(V r1) {
            r0 = this;
            super.setSuccess(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Promise, io.netty.util.concurrent.ProgressivePromise
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
            r0 = this;
            io.netty.util.concurrent.ProgressivePromise r1 = r0.setSuccess(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> sync() throws java.lang.InterruptedException {
            r0 = this;
            super.sync()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future syncUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture syncUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public io.netty.util.concurrent.ProgressivePromise<V> syncUninterruptibly() {
            r0 = this;
            super.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.DefaultPromise, io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise syncUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.ProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.ProgressivePromise
    public boolean tryProgress(long r5, long r7) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto L16
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L15
            boolean r7 = r4.isDone()
            if (r7 == 0) goto L12
            goto L15
        L12:
            r7 = -1
            goto L25
        L15:
            return r0
        L16:
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L2a
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L2a
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L25
            goto L2a
        L25:
            r4.notifyProgressiveListeners(r5, r7)
            r5 = 1
            return r5
        L2a:
            return r0
    }
}
