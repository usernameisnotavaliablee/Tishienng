package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultChannelProgressivePromise extends io.netty.util.concurrent.DefaultProgressivePromise<java.lang.Void> implements io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint {
    private final io.netty.channel.Channel channel;
    private long checkpoint;

    public DefaultChannelProgressivePromise(io.netty.channel.Channel r1) {
            r0 = this;
            r0.<init>()
            r0.channel = r1
            return
    }

    public DefaultChannelProgressivePromise(io.netty.channel.Channel r1, io.netty.util.concurrent.EventExecutor r2) {
            r0 = this;
            r0.<init>(r2)
            r0.channel = r1
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.addListener(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m44addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m45addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m46addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m47addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.addListeners(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m48addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m49addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m50addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m51addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise await() throws java.lang.InterruptedException {
            r0 = this;
            super.await()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m52await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m53await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m54await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m55await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise awaitUninterruptibly() {
            r0 = this;
            super.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m56awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m57awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m58awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m59awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            return r0
    }

    protected void checkDeadLock() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel()
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto Ld
            super/*io.netty.util.concurrent.DefaultPromise*/.checkDeadLock()
        Ld:
            return
    }

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super/*io.netty.util.concurrent.DefaultPromise*/.executor()
            if (r0 != 0) goto Le
            io.netty.channel.Channel r0 = r1.channel()
            io.netty.channel.EventLoop r0 = r0.eventLoop()
        Le:
            return r0
    }

    @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public long flushCheckpoint() {
            r2 = this;
            long r0 = r2.checkpoint
            return r0
    }

    @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public void flushCheckpoint(long r1) {
            r0 = this;
            r0.checkpoint = r1
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public boolean isVoid() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public io.netty.channel.ChannelProgressivePromise promise() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise promise() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.promise()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.removeListener(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m60removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m61removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m62removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m63removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.removeListeners(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m64removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m65removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m66removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m67removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelProgressivePromise setFailure(java.lang.Throwable r1) {
            r0 = this;
            super.setFailure(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.setFailure(r1)
            return r1
    }

    /* renamed from: setFailure, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m68setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.setFailure(r1)
            return r1
    }

    /* renamed from: setFailure, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m69setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.setFailure(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise
    public io.netty.channel.ChannelProgressivePromise setProgress(long r1, long r3) {
            r0 = this;
            super.setProgress(r1, r3)
            return r0
    }

    /* renamed from: setProgress, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m70setProgress(long r1, long r3) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.setProgress(r1, r3)
            return r1
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelProgressivePromise setSuccess() {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelProgressivePromise r0 = r1.setSuccess(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelProgressivePromise setSuccess(java.lang.Void r1) {
            r0 = this;
            super.setSuccess(r1)
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setSuccess() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.setSuccess()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setSuccess(java.lang.Void r1) {
            r0 = this;
            io.netty.channel.ChannelProgressivePromise r1 = r0.setSuccess(r1)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.ChannelProgressivePromise r1 = r0.setSuccess(r1)
            return r1
    }

    /* renamed from: setSuccess, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m71setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.ChannelProgressivePromise r1 = r0.setSuccess(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise sync() throws java.lang.InterruptedException {
            r0 = this;
            super.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m72sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m73sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m74sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m75sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelProgressiveFuture syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelProgressiveFuture, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelProgressivePromise syncUninterruptibly() {
            r0 = this;
            super.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m76syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressiveFuture m77syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.ProgressivePromise m78syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m79syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public boolean trySuccess() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.trySuccess(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelProgressivePromise, io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelProgressivePromise unvoid() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise unvoid() {
            r1 = this;
            io.netty.channel.ChannelProgressivePromise r0 = r1.unvoid()
            return r0
    }
}
