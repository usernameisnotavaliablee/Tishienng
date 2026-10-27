package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultEventLoopGroup extends io.netty.channel.MultithreadEventLoopGroup {
    public DefaultEventLoopGroup() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public DefaultEventLoopGroup(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DefaultEventLoopGroup(int r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultEventLoopGroup(int r2, java.util.concurrent.ThreadFactory r3) {
            r1 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.<init>(r2, r3, r0)
            return
    }

    @Override // io.netty.channel.MultithreadEventLoopGroup
    protected io.netty.channel.EventLoop newChild(java.util.concurrent.Executor r1, java.lang.Object... r2) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.DefaultEventLoop r2 = new io.netty.channel.DefaultEventLoop
            r2.<init>(r0, r1)
            return r2
    }

    @Override // io.netty.channel.MultithreadEventLoopGroup
    /* renamed from: newChild, reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ io.netty.util.concurrent.EventExecutor mo96newChild(java.util.concurrent.Executor r1, java.lang.Object[] r2) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.EventLoop r1 = r0.newChild(r1, r2)
            return r1
    }
}
