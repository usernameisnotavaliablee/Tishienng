package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsRecordEncoder implements io.netty.handler.codec.dns.DnsRecordEncoder {
    private static final int PREFIX_MASK = 7;

    protected DefaultDnsRecordEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static int calculateEcsAddressLength(int r0, int r1) {
            int r0 = r0 >>> 3
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            int r0 = r0 + r1
            return r0
    }

    private void encodeOptEcsRecord(io.netty.handler.codec.dns.DnsOptEcsRecord r7, io.netty.buffer.ByteBuf r8) throws java.lang.Exception {
            r6 = this;
            r6.encodeRecord0(r7, r8)
            int r0 = r7.sourcePrefixLength()
            int r1 = r7.scopePrefixLength()
            r2 = r0 & 7
            byte[] r7 = r7.address()
            int r3 = r7.length
            int r3 = r3 << 3
            if (r3 < r0) goto L59
            if (r0 < 0) goto L59
            int r3 = r7.length
            r4 = 4
            if (r3 != r4) goto L23
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv4
        L1e:
            int r3 = r3.addressNumber()
            goto L26
        L23:
            io.netty.channel.socket.InternetProtocolFamily r3 = io.netty.channel.socket.InternetProtocolFamily.IPv6
            goto L1e
        L26:
            short r3 = (short) r3
            int r4 = calculateEcsAddressLength(r0, r2)
            int r5 = r4 + 8
            r8.writeShort(r5)
            r5 = 8
            r8.writeShort(r5)
            int r5 = r4 + 4
            r8.writeShort(r5)
            r8.writeShort(r3)
            r8.writeByte(r0)
            r8.writeByte(r1)
            r0 = 0
            if (r2 <= 0) goto L55
            int r4 = r4 + (-1)
            r8.writeBytes(r7, r0, r4)
            r7 = r7[r4]
            byte r7 = padWithZeros(r7, r2)
            r8.writeByte(r7)
            return
        L55:
            r8.writeBytes(r7, r0, r4)
            return
        L59:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r1 = ": "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = " (expected: 0 >= "
            r8.append(r0)
            r8.append(r3)
            r0 = 41
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    private void encodeOptPseudoRecord(io.netty.handler.codec.dns.DnsOptPseudoRecord r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            r0.encodeRecord0(r1, r2)
            r1 = 0
            r2.writeShort(r1)
            return
    }

    private void encodePtrRecord(io.netty.handler.codec.dns.DnsPtrRecord r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            r0.encodeRecord0(r1, r2)
            java.lang.String r1 = r1.hostname()
            r0.encodeName(r1, r2)
            return
    }

    private void encodeRawRecord(io.netty.handler.codec.dns.DnsRawRecord r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            r2.encodeRecord0(r3, r4)
            io.netty.buffer.ByteBuf r3 = r3.content()
            int r0 = r3.readableBytes()
            r4.writeShort(r0)
            int r1 = r3.readerIndex()
            r4.writeBytes(r3, r1, r0)
            return
    }

    private void encodeRecord0(io.netty.handler.codec.dns.DnsRecord r3, io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = r3.name()
            r2.encodeName(r0, r4)
            io.netty.handler.codec.dns.DnsRecordType r0 = r3.type()
            int r0 = r0.intValue()
            r4.writeShort(r0)
            int r0 = r3.dnsClass()
            r4.writeShort(r0)
            long r0 = r3.timeToLive()
            int r3 = (int) r0
            r4.writeInt(r3)
            return
    }

    private static byte padWithZeros(byte r2, int r3) {
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
                case 4: goto L25;
                case 5: goto L22;
                case 6: goto L1f;
                case 7: goto L1b;
                case 8: goto L1a;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lowOrderBitsToPreserve: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L1a:
            return r2
        L1b:
            r2 = r2 & 254(0xfe, float:3.56E-43)
        L1d:
            byte r2 = (byte) r2
            return r2
        L1f:
            r2 = r2 & 252(0xfc, float:3.53E-43)
            goto L1d
        L22:
            r2 = r2 & 248(0xf8, float:3.48E-43)
            goto L1d
        L25:
            r2 = r2 & 240(0xf0, float:3.36E-43)
            goto L1d
        L28:
            r2 = r2 & 224(0xe0, float:3.14E-43)
            goto L1d
        L2b:
            r2 = r2 & 192(0xc0, float:2.69E-43)
            goto L1d
        L2e:
            r2 = r2 & 128(0x80, float:1.8E-43)
            goto L1d
        L31:
            r2 = 0
            return r2
    }

    protected void encodeName(java.lang.String r1, io.netty.buffer.ByteBuf r2) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.dns.DnsCodecUtil.encodeDomainName(r1, r2)
            return
    }

    @Override // io.netty.handler.codec.dns.DnsRecordEncoder
    public final void encodeQuestion(io.netty.handler.codec.dns.DnsQuestion r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = r2.name()
            r1.encodeName(r0, r3)
            io.netty.handler.codec.dns.DnsRecordType r0 = r2.type()
            int r0 = r0.intValue()
            r3.writeShort(r0)
            int r2 = r2.dnsClass()
            r3.writeShort(r2)
            return
    }

    @Override // io.netty.handler.codec.dns.DnsRecordEncoder
    public void encodeRecord(io.netty.handler.codec.dns.DnsRecord r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsQuestion
            if (r0 == 0) goto La
            io.netty.handler.codec.dns.DnsQuestion r2 = (io.netty.handler.codec.dns.DnsQuestion) r2
            r1.encodeQuestion(r2, r3)
            return
        La:
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsPtrRecord
            if (r0 == 0) goto L14
            io.netty.handler.codec.dns.DnsPtrRecord r2 = (io.netty.handler.codec.dns.DnsPtrRecord) r2
            r1.encodePtrRecord(r2, r3)
            return
        L14:
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsOptEcsRecord
            if (r0 == 0) goto L1e
            io.netty.handler.codec.dns.DnsOptEcsRecord r2 = (io.netty.handler.codec.dns.DnsOptEcsRecord) r2
            r1.encodeOptEcsRecord(r2, r3)
            return
        L1e:
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsOptPseudoRecord
            if (r0 == 0) goto L28
            io.netty.handler.codec.dns.DnsOptPseudoRecord r2 = (io.netty.handler.codec.dns.DnsOptPseudoRecord) r2
            r1.encodeOptPseudoRecord(r2, r3)
            return
        L28:
            boolean r0 = r2 instanceof io.netty.handler.codec.dns.DnsRawRecord
            if (r0 == 0) goto L32
            io.netty.handler.codec.dns.DnsRawRecord r2 = (io.netty.handler.codec.dns.DnsRawRecord) r2
            r1.encodeRawRecord(r2, r3)
            return
        L32:
            io.netty.handler.codec.UnsupportedMessageTypeException r3 = new io.netty.handler.codec.UnsupportedMessageTypeException
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r3.<init>(r2)
            throw r3
    }
}
