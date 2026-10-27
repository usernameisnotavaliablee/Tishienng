package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractEventLoopGroup extends io.netty.util.concurrent.AbstractEventExecutorGroup implements io.netty.channel.EventLoopGroup {
    public AbstractEventLoopGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.netty.channel.EventLoopGroup
    public abstract io.netty.channel.EventLoop next();

    /* renamed from: next, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor m25next() {
            r1 = this;
            io.netty.channel.EventLoop r0 = r1.next()
            return r0
    }
}
