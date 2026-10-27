package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractServerChannel extends io.netty.channel.AbstractChannel implements io.netty.channel.ServerChannel {
    private static final io.netty.channel.ChannelMetadata METADATA = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.channel.AbstractServerChannel$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class DefaultServerUnsafe extends io.netty.channel.AbstractChannel.AbstractUnsafe {
        final /* synthetic */ io.netty.channel.AbstractServerChannel this$0;

        private DefaultServerUnsafe(io.netty.channel.AbstractServerChannel r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        /* synthetic */ DefaultServerUnsafe(io.netty.channel.AbstractServerChannel r1, io.netty.channel.AbstractServerChannel.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.netty.channel.Channel.Unsafe
        public void connect(java.net.SocketAddress r1, java.net.SocketAddress r2, io.netty.channel.ChannelPromise r3) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                r0.safeSetFailure(r3, r1)
                return
        }
    }

    static {
            io.netty.channel.ChannelMetadata r0 = new io.netty.channel.ChannelMetadata
            r1 = 0
            r2 = 16
            r0.<init>(r1, r2)
            io.netty.channel.AbstractServerChannel.METADATA = r0
            return
    }

    protected AbstractServerChannel() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doDisconnect() throws java.lang.Exception {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected void doWrite(io.netty.channel.ChannelOutboundBuffer r1) throws java.lang.Exception {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.AbstractChannel
    protected final java.lang.Object filterOutboundMessage(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // io.netty.channel.Channel
    public io.netty.channel.ChannelMetadata metadata() {
            r1 = this;
            io.netty.channel.ChannelMetadata r0 = io.netty.channel.AbstractServerChannel.METADATA
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected io.netty.channel.AbstractChannel.AbstractUnsafe newUnsafe() {
            r2 = this;
            io.netty.channel.AbstractServerChannel$DefaultServerUnsafe r0 = new io.netty.channel.AbstractServerChannel$DefaultServerUnsafe
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.channel.AbstractChannel, io.netty.channel.Channel
    public java.net.SocketAddress remoteAddress() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.channel.AbstractChannel
    protected java.net.SocketAddress remoteAddress0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
