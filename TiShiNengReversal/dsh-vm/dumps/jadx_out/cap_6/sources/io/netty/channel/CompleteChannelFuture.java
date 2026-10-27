package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class CompleteChannelFuture extends io.netty.util.concurrent.CompleteFuture<java.lang.Void> implements io.netty.channel.ChannelFuture {
    private final io.netty.channel.Channel channel;

    protected CompleteChannelFuture(io.netty.channel.Channel r1, io.netty.util.concurrent.EventExecutor r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 == 0) goto L8
            r0.channel = r1
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "channel"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.addListener(r1)
            return r0
    }

    /* renamed from: addListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m30addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.addListeners(r1)
            return r0
    }

    /* renamed from: addListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m31addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture await() throws java.lang.InterruptedException {
            r0 = this;
            return r0
    }

    /* renamed from: await, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m32await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.await()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture awaitUninterruptibly() {
            r0 = this;
            return r0
    }

    /* renamed from: awaitUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m33awaitUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.Channel channel() {
            r1 = this;
            io.netty.channel.Channel r0 = r1.channel
            return r0
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

    public /* bridge */ /* synthetic */ java.lang.Object getNow() {
            r1 = this;
            java.lang.Void r0 = r1.m34getNow()
            return r0
    }

    /* renamed from: getNow, reason: collision with other method in class */
    public java.lang.Void m34getNow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public boolean isVoid() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> r1) {
            r0 = this;
            super.removeListener(r1)
            return r0
    }

    /* renamed from: removeListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m35removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>... r1) {
            r0 = this;
            super.removeListeners(r1)
            return r0
    }

    /* renamed from: removeListeners, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future m36removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.channel.ChannelFuture r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture sync() throws java.lang.InterruptedException {
            r0 = this;
            return r0
    }

    /* renamed from: sync, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future mo37sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.sync()
            return r0
    }

    @Override // io.netty.channel.ChannelFuture
    public io.netty.channel.ChannelFuture syncUninterruptibly() {
            r0 = this;
            return r0
    }

    /* renamed from: syncUninterruptibly, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future mo38syncUninterruptibly() {
            r1 = this;
            io.netty.channel.ChannelFuture r0 = r1.syncUninterruptibly()
            return r0
    }
}
