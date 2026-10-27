package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramDnsQueryEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsQuery, java.net.InetSocketAddress>> {
    private final io.netty.handler.codec.dns.DnsQueryEncoder encoder;

    public DatagramDnsQueryEncoder() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordEncoder r0 = io.netty.handler.codec.dns.DnsRecordEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public DatagramDnsQueryEncoder(io.netty.handler.codec.dns.DnsRecordEncoder r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.dns.DnsQueryEncoder r0 = new io.netty.handler.codec.dns.DnsQueryEncoder
            r0.<init>(r2)
            r1.encoder = r0
            return
    }

    protected io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsQuery, java.net.InetSocketAddress> r2) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            r2 = 1024(0x400, float:1.435E-42)
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            return r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsQuery, java.net.InetSocketAddress> r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            java.net.SocketAddress r0 = r4.recipient()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            java.lang.Object r1 = r4.content()
            io.netty.handler.codec.dns.DnsQuery r1 = (io.netty.handler.codec.dns.DnsQuery) r1
            io.netty.buffer.ByteBuf r3 = r2.allocateBuffer(r3, r4)
            io.netty.handler.codec.dns.DnsQueryEncoder r4 = r2.encoder     // Catch: java.lang.Throwable -> L1f
            r4.encode(r1, r3)     // Catch: java.lang.Throwable -> L1f
            io.netty.channel.socket.DatagramPacket r4 = new io.netty.channel.socket.DatagramPacket
            r1 = 0
            r4.<init>(r3, r0, r1)
            r5.add(r4)
            return
        L1f:
            r4 = move-exception
            r3.release()
            throw r4
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsQuery, java.net.InetSocketAddress> r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.AddressedEnvelope r2 = (io.netty.channel.AddressedEnvelope) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
