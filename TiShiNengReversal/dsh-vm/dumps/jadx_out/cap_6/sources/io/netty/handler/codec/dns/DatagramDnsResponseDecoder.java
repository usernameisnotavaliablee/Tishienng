package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramDnsResponseDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.socket.DatagramPacket> {
    private final io.netty.handler.codec.dns.DnsResponseDecoder<java.net.InetSocketAddress> responseDecoder;


    public DatagramDnsResponseDecoder() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordDecoder r0 = io.netty.handler.codec.dns.DnsRecordDecoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public DatagramDnsResponseDecoder(io.netty.handler.codec.dns.DnsRecordDecoder r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.dns.DatagramDnsResponseDecoder$1 r0 = new io.netty.handler.codec.dns.DatagramDnsResponseDecoder$1
            r0.<init>(r1, r2)
            r1.responseDecoder = r0
            return
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.socket.DatagramPacket r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.dns.DnsResponseDecoder<java.net.InetSocketAddress> r3 = r2.responseDecoder
            java.net.SocketAddress r0 = r4.sender()
            java.net.SocketAddress r1 = r4.recipient()
            java.lang.Object r4 = r4.content()
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            io.netty.handler.codec.dns.DnsResponse r3 = r3.decode(r0, r1, r4)
            r5.add(r3)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.socket.DatagramPacket r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r2 = (io.netty.channel.socket.DatagramPacket) r2
            r0.decode2(r1, r2, r3)
            return
    }
}
