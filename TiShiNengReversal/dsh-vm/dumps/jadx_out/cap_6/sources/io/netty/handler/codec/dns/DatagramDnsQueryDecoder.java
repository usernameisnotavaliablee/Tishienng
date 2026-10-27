package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DatagramDnsQueryDecoder extends io.netty.handler.codec.MessageToMessageDecoder<io.netty.channel.socket.DatagramPacket> {
    private final io.netty.handler.codec.dns.DnsRecordDecoder recordDecoder;

    public DatagramDnsQueryDecoder() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordDecoder r0 = io.netty.handler.codec.dns.DnsRecordDecoder.DEFAULT
            r1.<init>(r0)
            return
    }

    public DatagramDnsQueryDecoder(io.netty.handler.codec.dns.DnsRecordDecoder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "recordDecoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsRecordDecoder r2 = (io.netty.handler.codec.dns.DnsRecordDecoder) r2
            r1.recordDecoder = r2
            return
    }

    private void decodeQuestions(io.netty.handler.codec.dns.DnsQuery r3, io.netty.buffer.ByteBuf r4, int r5) throws java.lang.Exception {
            r2 = this;
        L0:
            if (r5 <= 0) goto L10
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            io.netty.handler.codec.dns.DnsRecordDecoder r1 = r2.recordDecoder
            io.netty.handler.codec.dns.DnsQuestion r1 = r1.decodeQuestion(r4)
            r3.addRecord(r0, r1)
            int r5 = r5 + (-1)
            goto L0
        L10:
            return
    }

    private void decodeRecords(io.netty.handler.codec.dns.DnsQuery r2, io.netty.handler.codec.dns.DnsSection r3, io.netty.buffer.ByteBuf r4, int r5) throws java.lang.Exception {
            r1 = this;
        L0:
            if (r5 <= 0) goto L11
            io.netty.handler.codec.dns.DnsRecordDecoder r0 = r1.recordDecoder
            io.netty.handler.codec.dns.DnsRecord r0 = r0.decodeRecord(r4)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            r2.addRecord(r3, r0)
            int r5 = r5 + (-1)
            goto L0
        L11:
            return
    }

    private static io.netty.handler.codec.dns.DnsQuery newQuery(io.netty.channel.socket.DatagramPacket r5, io.netty.buffer.ByteBuf r6) {
            int r0 = r6.readUnsignedShort()
            int r6 = r6.readUnsignedShort()
            int r1 = r6 >> 15
            r2 = 1
            if (r1 == r2) goto L39
            io.netty.handler.codec.dns.DatagramDnsQuery r1 = new io.netty.handler.codec.dns.DatagramDnsQuery
            java.net.SocketAddress r3 = r5.sender()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.SocketAddress r5 = r5.recipient()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            int r4 = r6 >> 11
            r4 = r4 & 15
            byte r4 = (byte) r4
            io.netty.handler.codec.dns.DnsOpCode r4 = io.netty.handler.codec.dns.DnsOpCode.valueOf(r4)
            r1.<init>(r3, r5, r0, r4)
            int r5 = r6 >> 8
            r5 = r5 & r2
            if (r5 != r2) goto L2d
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r1.setRecursionDesired(r2)
            int r5 = r6 >> 4
            r5 = r5 & 7
            r1.setZ(r5)
            return r1
        L39:
            io.netty.handler.codec.CorruptedFrameException r5 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r6 = "not a query"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: decode, reason: avoid collision after fix types in other method */
    protected void decode2(io.netty.channel.ChannelHandlerContext r5, io.netty.channel.socket.DatagramPacket r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
            r4 = this;
            java.lang.Object r5 = r6.content()
            io.netty.buffer.ByteBuf r5 = (io.netty.buffer.ByteBuf) r5
            io.netty.handler.codec.dns.DnsQuery r6 = newQuery(r6, r5)
            int r0 = r5.readUnsignedShort()     // Catch: java.lang.Throwable -> L30
            int r1 = r5.readUnsignedShort()     // Catch: java.lang.Throwable -> L30
            int r2 = r5.readUnsignedShort()     // Catch: java.lang.Throwable -> L30
            int r3 = r5.readUnsignedShort()     // Catch: java.lang.Throwable -> L30
            r4.decodeQuestions(r6, r5, r0)     // Catch: java.lang.Throwable -> L30
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ANSWER     // Catch: java.lang.Throwable -> L30
            r4.decodeRecords(r6, r0, r5, r1)     // Catch: java.lang.Throwable -> L30
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.AUTHORITY     // Catch: java.lang.Throwable -> L30
            r4.decodeRecords(r6, r0, r5, r2)     // Catch: java.lang.Throwable -> L30
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL     // Catch: java.lang.Throwable -> L30
            r4.decodeRecords(r6, r0, r5, r3)     // Catch: java.lang.Throwable -> L30
            r7.add(r6)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r5 = move-exception
            r6.release()
            throw r5
    }

    @Override // io.netty.handler.codec.MessageToMessageDecoder
    protected /* bridge */ /* synthetic */ void decode(io.netty.channel.ChannelHandlerContext r1, io.netty.channel.socket.DatagramPacket r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.channel.socket.DatagramPacket r2 = (io.netty.channel.socket.DatagramPacket) r2
            r0.decode2(r1, r2, r3)
            return
    }
}
