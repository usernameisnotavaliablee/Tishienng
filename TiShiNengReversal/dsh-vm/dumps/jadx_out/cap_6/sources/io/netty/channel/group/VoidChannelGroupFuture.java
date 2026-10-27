package io.netty.channel.group;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class VoidChannelGroupFuture implements io.netty.channel.group.ChannelGroupFuture {
    private static final java.util.Iterator<io.netty.channel.ChannelFuture> EMPTY = null;
    private final io.netty.channel.group.ChannelGroup group;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            io.netty.channel.group.VoidChannelGroupFuture.EMPTY = r0
            return
    }

    VoidChannelGroupFuture(io.netty.channel.group.ChannelGroup r1) {
            r0 = this;
            r0.<init>()
            r0.group = r1
            return
    }

    private static java.lang.RuntimeException reject() {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "void future"
            r0.<init>(r1)
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m164addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m165addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture await() {
            r1 = this;
            java.lang.RuntimeException r0 = reject()
            throw r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m166await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.ChannelGroupFuture r0 = r1.await()
            return r0
    }

    public boolean await(long r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    public boolean await(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture awaitUninterruptibly() {
            r1 = this;
            java.lang.RuntimeException r0 = reject()
            throw r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m167awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.group.ChannelGroupFuture r0 = r1.awaitUninterruptibly()
            return r0
    }

    public boolean awaitUninterruptibly(long r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    public boolean awaitUninterruptibly(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    public boolean cancel(boolean r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupException cause() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: cause, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Throwable m168cause() {
            r1 = this;
            io.netty.channel.group.ChannelGroupException r0 = r1.cause()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.ChannelFuture find(io.netty.channel.Channel r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            r1 = this;
            java.lang.Void r0 = r1.m169get()
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            r0 = this;
            java.lang.Void r1 = r0.m170get(r1, r3)
            return r1
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.lang.Void m169get() {
            r1 = this;
            java.lang.RuntimeException r0 = reject()
            throw r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public java.lang.Void m170get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object getNow() {
            r1 = this;
            java.lang.Void r0 = r1.m171getNow()
            return r0
    }

    /* renamed from: getNow, reason: collision with other method in class */
    public java.lang.Void m171getNow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroup group() {
            r1 = this;
            io.netty.channel.group.ChannelGroup r0 = r1.group
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

    @Override // io.netty.channel.group.ChannelGroupFuture
    public boolean isPartialFailure() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public boolean isPartialSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public boolean isSuccess() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture, java.lang.Iterable
    public java.util.Iterator<io.netty.channel.ChannelFuture> iterator() {
            r1 = this;
            java.util.Iterator<io.netty.channel.ChannelFuture> r0 = io.netty.channel.group.VoidChannelGroupFuture.EMPTY
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m172removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            java.lang.RuntimeException r1 = reject()
            throw r1
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m173removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.group.ChannelGroupFuture r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture sync() {
            r1 = this;
            java.lang.RuntimeException r0 = reject()
            throw r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m174sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.group.ChannelGroupFuture r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.group.ChannelGroupFuture
    public io.netty.channel.group.ChannelGroupFuture syncUninterruptibly() {
            r1 = this;
            java.lang.RuntimeException r0 = reject()
            throw r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m175syncUninterruptibly() {
            r1 = this;
            io.netty.channel.group.ChannelGroupFuture r0 = r1.syncUninterruptibly()
            return r0
    }
}
