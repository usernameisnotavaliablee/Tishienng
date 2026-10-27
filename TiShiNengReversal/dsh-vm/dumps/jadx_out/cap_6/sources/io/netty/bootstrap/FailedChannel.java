package io.netty.bootstrap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class FailedChannel extends io.netty.channel.AbstractChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;
    private final io.netty.channel.ChannelConfig config;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.bootstrap.FailedChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class FailedChannelUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.bootstrap.FailedChannel this$0;

        private FailedChannelUnsafe(io.netty.bootstrap.FailedChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ FailedChannelUnsafe(io.netty.bootstrap.FailedChannel r1, io.netty.bootstrap.FailedChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                r3.setFailure(r1)
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r0.<init>(r1)
            io.netty.bootstrap.FailedChannel.METADATA = r0
            return
    }

    FailedChannel() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            io.netty.channel.DefaultChannelConfig r0 = new io.netty.channel.DefaultChannelConfig
            r0.<init>(r1)
            r1.config = r0
            return
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelConfig config() {
            r1 = this;
            io.netty.channel.ChannelConfig r0 = r1.config
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBeginRead() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doBind(java.net.SocketAddress r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doClose() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public boolean isActive() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected boolean isCompatible(io.netty.channel.EventLoop r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // io.netty.channel.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress localAddress0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.bootstrap.FailedChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.bootstrap.FailedChannel$FailedChannelUnsafe r0 = new io.netty.bootstrap.FailedChannel$FailedChannelUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
