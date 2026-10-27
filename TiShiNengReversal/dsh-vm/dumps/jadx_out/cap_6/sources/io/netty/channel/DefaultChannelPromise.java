package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultChannelPromise extends io.netty.util.concurrent.DefaultPromise<java.lang.Void> implements io.netty.channel.ChannelPromise, io.netty.channel.ChannelFlushPromiseNotifier.FlushCheckpoint {
    private final io.netty.channel.Channel channel;
    private long checkpoint;

    public DefaultChannelPromise(io.netty.channel.Channel r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "channel"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.Channel r2 = (io.netty.channel.Channel) r2
            r1.channel = r2
            return
    }

    public DefaultChannelPromise(io.netty.channel.Channel r1, io.netty.util.concurrent.EventExecutor r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r2 = "channel"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r1, r2)
            io.netty.channel.Channel r1 = (io.netty.channel.Channel) r1
            r0.channel = r1
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.addListener(r1)
            return r0
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m80addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m81addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.addListeners(r1)
            return r0
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m82addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m83addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise await() throws java.lang.InterruptedException {
            r0 = this;
            super.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m84await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m85await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise awaitUninterruptibly() {
            r0 = this;
            super.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m86awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m87awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
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
            super.checkDeadLock()
        Ld:
            return
    }

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super.executor()
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
    public io.netty.channel.ChannelPromise promise() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.removeListener(r1)
            return r0
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m88removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m89removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.removeListeners(r1)
            return r0
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m90removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m91removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    public io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r1) {
            r0 = this;
            super.setFailure(r1)
            return r0
    }

    /* renamed from: setFailure */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise mo20setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.setFailure(r1)
            return r1
    }

    public io.netty.channel.ChannelPromise setSuccess() {
            r1 = this;
            r0 = 0
            io.netty.channel.ChannelPromise r0 = r1.setSuccess(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise setSuccess(java.lang.Void r1) {
            r0 = this;
            super.setSuccess(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.ChannelPromise r1 = r0.setSuccess(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise sync() throws java.lang.InterruptedException {
            r0 = this;
            super.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m92sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m93sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise syncUninterruptibly() {
            r0 = this;
            super.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m94syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m95syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    public boolean trySuccess() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.trySuccess(r0)
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise unvoid() {
            r0 = this;
            return r0
    }
}
