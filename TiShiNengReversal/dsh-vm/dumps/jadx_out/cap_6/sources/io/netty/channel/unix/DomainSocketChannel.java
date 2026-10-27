package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface DomainSocketChannel extends io.netty.channel.unix.UnixChannel, io.netty.channel.socket.DuplexChannel {
    @Override // io.netty.channel.Channel
    io.netty.channel.unix.DomainSocketChannelConfig config();

    @Override // io.netty.channel.Channel
    io.netty.channel.unix.DomainSocketAddress localAddress();

    @Override // io.netty.channel.Channel
    io.netty.channel.unix.DomainSocketAddress remoteAddress();
}
