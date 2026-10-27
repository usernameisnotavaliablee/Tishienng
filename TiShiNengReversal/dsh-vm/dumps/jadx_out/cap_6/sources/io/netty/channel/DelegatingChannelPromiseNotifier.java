package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DelegatingChannelPromiseNotifier implements io.netty.channel.ChannelPromise, io.netty.channel.ChannelFutureListener {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private final io.netty.channel.ChannelPromise delegate;
    private final boolean logNotifyFailure;

    static {
            java.lang.Class<io.netty.channel.DelegatingChannelPromiseNotifier> r0 = io.netty.channel.DelegatingChannelPromiseNotifier.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.channel.DelegatingChannelPromiseNotifier.logger = r0
            return
    }

    public DelegatingChannelPromiseNotifier(io.netty.channel.ChannelPromise r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.channel.VoidChannelPromise
            r0 = r0 ^ 1
            r1.<init>(r2, r0)
            return
    }

    public DelegatingChannelPromiseNotifier(io.netty.channel.ChannelPromise r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "delegate"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.channel.ChannelPromise r2 = (io.netty.channel.ChannelPromise) r2
            r1.delegate = r2
            r1.logNotifyFailure = r3
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.addListener(r2)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m101addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListener(r1)
            return r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m102addListener(io.netty.util.concurrent.GenericFutureListener r1) {
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
    public io.netty.channel.ChannelPromise addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.addListeners(r2)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m103addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.addListeners(r1)
            return r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m104addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
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
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.await()
            return r1
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m105await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.await()
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m106await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.await()
            return r0
    }

    public boolean await(long r2) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.await(r2)
            return r2
    }

    public boolean await(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.await(r2, r4)
            return r2
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.awaitUninterruptibly()
            return r1
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m107awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m108awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.awaitUninterruptibly()
            return r0
    }

    public boolean awaitUninterruptibly(long r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.awaitUninterruptibly(r2)
            return r2
    }

    public boolean awaitUninterruptibly(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.awaitUninterruptibly(r2, r4)
            return r2
    }

    public boolean cancel(boolean r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.cancel(r2)
            return r2
    }

    public java.lang.Throwable cause() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            java.lang.Throwable r0 = r0.cause()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            io.netty.channel.Channel r0 = r0.channel()
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.lang.Void r0 = r1.m109get()
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            java.lang.Void r1 = r0.m110get(r1, r3)
            return r1
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.lang.Void m109get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            java.lang.Object r0 = r0.get()
            java.lang.Void r0 = (java.lang.Void) r0
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.lang.Void m110get(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2, r4)
            java.lang.Void r2 = (java.lang.Void) r2
            return r2
    }

    public /* bridge */ /* synthetic */ java.lang.Object getNow() {
            r1 = this;
            java.lang.Void r0 = r1.m111getNow()
            return r0
    }

    /* renamed from: getNow, reason: collision with other method in class */
    public java.lang.Void m111getNow() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            java.lang.Object r0 = r0.getNow()
            java.lang.Void r0 = (java.lang.Void) r0
            return r0
    }

    public boolean isCancellable() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.isCancellable()
            return r0
    }

    public boolean isCancelled() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.isCancelled()
            return r0
    }

    public boolean isDone() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.isDone()
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.isSuccess()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public boolean isVoid() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.isVoid()
            return r0
    }

    public void operationComplete(io.netty.channel.ChannelFuture r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = r2.logNotifyFailure
            if (r0 == 0) goto L7
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.channel.DelegatingChannelPromiseNotifier.logger
            goto L8
        L7:
            r0 = 0
        L8:
            boolean r1 = r3.isSuccess()
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r3.get()
            java.lang.Void r3 = (java.lang.Void) r3
            io.netty.channel.ChannelPromise r1 = r2.delegate
            io.netty.util.internal.PromiseNotificationUtil.trySuccess(r1, r3, r0)
            return
        L1a:
            boolean r1 = r3.isCancelled()
            if (r1 == 0) goto L26
            io.netty.channel.ChannelPromise r3 = r2.delegate
            io.netty.util.internal.PromiseNotificationUtil.tryCancel(r3, r0)
            return
        L26:
            java.lang.Throwable r3 = r3.cause()
            io.netty.channel.ChannelPromise r1 = r2.delegate
            io.netty.util.internal.PromiseNotificationUtil.tryFailure(r1, r3, r0)
            return
    }

    public /* bridge */ /* synthetic */ void operationComplete(io.netty.util.concurrent.Future r1) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = (io.netty.channel.ChannelFuture) r1
            r0.operationComplete(r1)
            return
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.removeListener(r2)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m112removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListener(r1)
            return r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m113removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
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
    public io.netty.channel.ChannelPromise removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.removeListeners(r2)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m114removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m115removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise setFailure(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.setFailure(r2)
            return r1
    }

    /* renamed from: setFailure, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m116setFailure(java.lang.Throwable r1) {
            r0 = this;
            io.netty.channel.ChannelPromise r1 = r0.setFailure(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise setSuccess() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.setSuccess()
            return r1
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise setSuccess(java.lang.Void r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.setSuccess(r2)
            return r1
    }

    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise setSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            io.netty.channel.ChannelPromise r1 = r0.setSuccess(r1)
            return r1
    }

    public boolean setUncancellable() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.setUncancellable()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public /* bridge */ /* synthetic */ io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelPromise, io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelPromise sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.sync()
            return r1
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m117sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.sync()
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m118sync() throws java.lang.InterruptedException {
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
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            r0.syncUninterruptibly()
            return r1
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m119syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Promise m120syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.syncUninterruptibly()
            return r0
    }

    public boolean tryFailure(java.lang.Throwable r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.tryFailure(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelPromise
    public boolean trySuccess() {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r0 = r0.trySuccess()
            return r0
    }

    public /* bridge */ /* synthetic */ boolean trySuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.trySuccess(r1)
            return r1
    }

    public boolean trySuccess(java.lang.Void r2) {
            r1 = this;
            io.netty.channel.ChannelPromise r0 = r1.delegate
            boolean r2 = r0.trySuccess(r2)
            return r2
    }

    @Override // io.netty.channel.ChannelPromise
    public io.netty.channel.ChannelPromise unvoid() {
            r2 = this;
            boolean r0 = r2.isVoid()
            if (r0 == 0) goto L12
            io.netty.channel.DelegatingChannelPromiseNotifier r0 = new io.netty.channel.DelegatingChannelPromiseNotifier
            io.netty.channel.ChannelPromise r1 = r2.delegate
            io.netty.channel.ChannelPromise r1 = r1.unvoid()
            r0.<init>(r1)
            return r0
        L12:
            return r2
    }
}
