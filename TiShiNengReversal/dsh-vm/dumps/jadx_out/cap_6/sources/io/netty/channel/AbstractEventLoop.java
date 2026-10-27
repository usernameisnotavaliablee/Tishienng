package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractEventLoop extends io.netty.util.concurrent.AbstractEventExecutor implements io.netty.channel.EventLoop {
    protected AbstractEventLoop() {
            r0 = this;
            r0.<init>()
            return
    }

    protected AbstractEventLoop(io.netty.channel.EventLoopGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.netty.channel.EventLoopGroup
    public io.netty.channel.EventLoop next() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = super.next()
            io.netty.channel.EventLoop r0 = (io.netty.channel.EventLoop) r0
            return r0
    }

    /* renamed from: next, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m23next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }

    @Override // io.netty.channel.EventLoop
    public io.netty.channel.EventLoopGroup parent() {
            r1 = this;
            io.netty.util.concurrent.EventExecutorGroup r0 = super.parent()
            io.netty.channel.EventLoopGroup r0 = (io.netty.channel.EventLoopGroup) r0
            return r0
    }

    /* renamed from: parent, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutorGroup m24parent() {
            r1 = this;
            io.netty.channel.EventLoopGroup r0 = r1.parent()
            return r0
    }
}
