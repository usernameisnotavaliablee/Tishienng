package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class VoidChannelPromise extends io.netty.util.concurrent.AbstractFuture<java.lang.Void> implements io.netty.channel.ChannelPromise {
    private final io.netty.channel.Channel channel;
    private final io.netty.channel.ChannelFutureListener fireExceptionListener;


    public VoidChannelPromise(io.netty.channel.Channel r1, boolean r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L15
            r0.channel = r1
            if (r2 == 0) goto L11
            io.netty.channel.VoidChannelPromise$1 r1 = new io.netty.channel.VoidChannelPromise$1
            r1.<init>(r0)
            r0.fireExceptionListener = r1
            return
        L11:
            r1 = 0
            r0.fireExceptionListener = r1
            return
        L15:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "channel"
            r1.<init>(r2)
            throw r1
    }

    static /* synthetic */ void access$000(io.netty.channel.VoidChannelPromise r0, java.lang.Throwable r1) {
            r0.fireException0(r1)
            return
    }

    private static void fail() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "void future"
            r0.<init>(r1)
            throw r0
    }

    private void fireException0(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.ChannelFutureListener r0 = r1.fireExceptionListener
            if (r0 == 0) goto L15
            io.netty.channel.Channel r0 = r1.channel
            boolean r0 = r0.isRegistered()
            if (r0 == 0) goto L15
            io.netty.channel.Channel r0 = r1.channel
            io.netty.channel.ChannelPipeline r0 = r0.pipeline()
            r0.fireExceptionCaught(r2)
        L15:
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            fail()
            return r0
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m126addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m127addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            fail()
            return r0
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m128addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m129addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise await() throws java.lang.InterruptedException {
            r1 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m130await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m131await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.await()
            return r0
    }

    public boolean await(long r1) {
            r0 = this;
            fail()
            r1 = 0
            return r1
    }

    public boolean await(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            fail()
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise awaitUninterruptibly() {
            r0 = this;
            fail()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m132awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m133awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    public boolean awaitUninterruptibly(long r1) {
            r0 = this;
            fail()
            r1 = 0
            return r1
    }

    public boolean awaitUninterruptibly(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            fail()
            r1 = 0
            return r1
    }

    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.Throwable cause() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object getNow() {
            r1 = this;
            java.lang.Void r0 = r1.m134getNow()
            return r0
    }

    /* renamed from: getNow, reason: collision with other method in class */
    public java.lang.Void m134getNow() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isCancellable() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isDone() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public boolean isVoid() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            return r0
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m135removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m136removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            return r0
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m137removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m138removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.setFailure(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.VoidChannelPromise setFailure(java.lang.Throwable r1) {
            r0 = this;
            r0.fireException0(r1)
            return r0
    }

    /* renamed from: setFailure, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m139setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.setFailure(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setSuccess() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.setSuccess()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise setSuccess(java.lang.Void r1) {
            r0 = this;
            io.netty.channel.VoidChannelPromise r1 = r0.setSuccess(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.VoidChannelPromise setSuccess() {
            r0 = this;
            return r0
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.VoidChannelPromise setSuccess(java.lang.Void r1) {
            r0 = this;
            return r0
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.VoidChannelPromise r1 = r0.setSuccess(r1)
            return r1
    }

    public boolean setUncancellable() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise sync() {
            r0 = this;
            fail()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m140sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m141sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture syncUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelPromise syncUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.VoidChannelPromise syncUninterruptibly() {
            r0 = this;
            fail()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m142syncUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m143syncUninterruptibly() {
            r1 = this;
            io.netty.channel.VoidChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    public boolean tryFailure(java.lang.Throwable r1) {
            r0 = this;
            r0.fireException0(r1)
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public boolean trySuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    public /* bridge */ /* synthetic */ boolean trySuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.trySuccess(r1)
            return r1
    }

    public boolean trySuccess(java.lang.Void r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise unvoid() {
            r2 = this;
            io.netty.channel.DefaultChannelPromise r0 = new io.netty.channel.DefaultChannelPromise
            io.netty.channel.Channel r1 = r2.channel
            r0.<init>(r1)
            io.netty.channel.ChannelFutureListener r1 = r2.fireExceptionListener
            if (r1 == 0) goto Le
            r0.addListener(r1)
        Le:
            return r0
    }
}
