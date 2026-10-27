package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramDnsResponseEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress>> {
    private final io.netty.handler.codec.dns.DnsRecordEncoder recordEncoder;

    public DatagramDnsResponseEncoder() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordEncoder r0 = io.netty.handler.codec.dns.DnsRecordEncoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public DatagramDnsResponseEncoder(io.netty.handler.codec.dns.DnsRecordEncoder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "recordEncoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsRecordEncoder r2 = (io.netty.handler.codec.dns.DnsRecordEncoder) r2
            r1.recordEncoder = r2
            return
    }

    private static void encodeHeader(io.netty.handler.codec.dns.DnsResponse r3, io.netty.buffer.ByteBuf r4) {
            int r0 = r3.id()
            r4.writeShort(r0)
            io.netty.handler.codec.dns.DnsOpCode r0 = r3.opCode()
            byte r0 = r0.byteValue()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 11
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            boolean r2 = r3.isAuthoritativeAnswer()
            if (r2 == 0) goto L21
            r1 = 33792(0x8400, float:4.7353E-41)
            r1 = r1 | r0
        L21:
            boolean r0 = r3.isTruncated()
            if (r0 == 0) goto L29
            r1 = r1 | 512(0x200, float:7.17E-43)
        L29:
            boolean r0 = r3.isRecursionDesired()
            if (r0 == 0) goto L31
            r1 = r1 | 256(0x100, float:3.59E-43)
        L31:
            boolean r0 = r3.isRecursionAvailable()
            if (r0 == 0) goto L39
            r1 = r1 | 128(0x80, float:1.8E-43)
        L39:
            int r0 = r3.z()
            int r0 = r0 << 4
            r0 = r0 | r1
            io.netty.handler.codec.dns.DnsResponseCode r1 = r3.code()
            int r1 = r1.intValue()
            r0 = r0 | r1
            r4.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            int r0 = r3.count(r0)
            r4.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ANSWER
            int r0 = r3.count(r0)
            r4.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.AUTHORITY
            int r0 = r3.count(r0)
            r4.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            int r3 = r3.count(r0)
            r4.writeShort(r3)
            return
    }

    private void encodeQuestions(io.netty.handler.codec.dns.DnsResponse r5, io.netty.buffer.ByteBuf r6) throws java.lang.Exception {
            r4 = this;
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            int r0 = r5.count(r0)
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            io.netty.handler.codec.dns.DnsRecordEncoder r2 = r4.recordEncoder
            io.netty.handler.codec.dns.DnsSection r3 = io.netty.handler.codec.dns.DnsSection.QUESTION
            io.netty.handler.codec.dns.DnsRecord r3 = r5.recordAt(r3, r1)
            io.netty.handler.codec.dns.DnsQuestion r3 = (io.netty.handler.codec.dns.DnsQuestion) r3
            r2.encodeQuestion(r3, r6)
            int r1 = r1 + 1
            goto L7
        L19:
            return
    }

    private void encodeRecords(io.netty.handler.codec.dns.DnsResponse r5, io.netty.handler.codec.dns.DnsSection r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
            r4 = this;
            int r0 = r5.count(r6)
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            io.netty.handler.codec.dns.DnsRecordEncoder r2 = r4.recordEncoder
            io.netty.handler.codec.dns.DnsRecord r3 = r5.recordAt(r6, r1)
            r2.encodeRecord(r3, r7)
            int r1 = r1 + 1
            goto L5
        L13:
            return
    }

    protected io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r2) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            r2 = 1024(0x400, float:1.435E-42)
            io.netty.buffer.ByteBuf r1 = r1.ioBuffer(r2)
            return r1
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r3, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            java.net.SocketAddress r0 = r4.recipient()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            java.lang.Object r1 = r4.content()
            io.netty.handler.codec.dns.DnsResponse r1 = (io.netty.handler.codec.dns.DnsResponse) r1
            io.netty.buffer.ByteBuf r3 = r2.allocateBuffer(r3, r4)
            encodeHeader(r1, r3)     // Catch: java.lang.Throwable -> L2f
            r2.encodeQuestions(r1, r3)     // Catch: java.lang.Throwable -> L2f
            io.netty.handler.codec.dns.DnsSection r4 = io.netty.handler.codec.dns.DnsSection.ANSWER     // Catch: java.lang.Throwable -> L2f
            r2.encodeRecords(r1, r4, r3)     // Catch: java.lang.Throwable -> L2f
            io.netty.handler.codec.dns.DnsSection r4 = io.netty.handler.codec.dns.DnsSection.AUTHORITY     // Catch: java.lang.Throwable -> L2f
            r2.encodeRecords(r1, r4, r3)     // Catch: java.lang.Throwable -> L2f
            io.netty.handler.codec.dns.DnsSection r4 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL     // Catch: java.lang.Throwable -> L2f
            r2.encodeRecords(r1, r4, r3)     // Catch: java.lang.Throwable -> L2f
            io.netty.channel.socket.DatagramPacket r4 = new io.netty.channel.socket.DatagramPacket
            r1 = 0
            r4.<init>(r3, r0, r1)
            r5.add(r4)
            return
        L2f:
            r4 = move-exception
            r3.release()
            throw r4
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.AddressedEnvelope<io.netty.handler.codec.dns.DnsResponse, java.net.InetSocketAddress> r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.AddressedEnvelope r2 = (io.netty.channel.AddressedEnvelope) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
