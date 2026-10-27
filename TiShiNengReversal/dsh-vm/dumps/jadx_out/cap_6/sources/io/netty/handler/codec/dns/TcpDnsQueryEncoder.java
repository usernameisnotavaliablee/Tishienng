package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class TcpDnsQueryEncoder extends io.netty.handler.codec.MessageToByteEncoder<io.netty.handler.codec.dns.DnsQuery> {
    private final io.netty.handler.codec.dns.DnsQueryEncoder encoder;

    public TcpDnsQueryEncoder() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordEncoder r0 = io.netty.handler.codec.dns.DnsRecordEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public TcpDnsQueryEncoder(io.netty.handler.codec.dns.DnsRecordEncoder r2) {
            r1 = this;
            r1.<init>()
            io.netty.handler.codec.dns.DnsQueryEncoder r0 = new io.netty.handler.codec.dns.DnsQueryEncoder
            r0.<init>(r2)
            r1.encoder = r0
            return
    }

    /* renamed from: allocateBuffer, reason: avoid collision after fix types in other method */
    protected io.netty.buffer.ByteBuf allocateBuffer2(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.dns.DnsQuery r2, boolean r3) {
            r0 = this;
            r2 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Ld
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            return r1
        Ld:
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = r1.heapBuffer(r2)
            return r1
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.dns.DnsQuery r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r2 = (io.netty.handler.codec.dns.DnsQuery) r2
            io.netty.buffer.ByteBuf r1 = r0.allocateBuffer2(r1, r2, r3)
            return r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.dns.DnsQuery r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            int r1 = r3.writerIndex()
            int r1 = r1 + 2
            r3.writerIndex(r1)
            io.netty.handler.codec.dns.DnsQueryEncoder r1 = r0.encoder
            r1.encode(r2, r3)
            int r1 = r3.readableBytes()
            int r1 = r1 + (-2)
            r2 = 0
            r3.setShort(r2, r1)
            return
    }

    @Override // io.netty.handler.codec.MessageToByteEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.dns.DnsQuery r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.dns.DnsQuery r2 = (io.netty.handler.codec.dns.DnsQuery) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
