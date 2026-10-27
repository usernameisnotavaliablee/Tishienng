package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultDnsRecordDecoder implements io.netty.handler.codec.dns.DnsRecordDecoder {
    static final java.lang.String ROOT = ".";

    protected DefaultDnsRecordDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String decodeName(io.netty.buffer.ByteBuf r0) {
            java.lang.String r0 = io.netty.handler.codec.dns.DnsCodecUtil.decodeDomainName(r0)
            return r0
    }

    protected java.lang.String decodeName0(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            java.lang.String r1 = decodeName(r1)
            return r1
    }

    @Override // io.netty.handler.codec.dns.DnsRecordDecoder
    public final io.netty.handler.codec.dns.DnsQuestion decodeQuestion(io.netty.buffer.ByteBuf r4) throws java.lang.Exception {
            r3 = this;
            java.lang.String r0 = decodeName(r4)
            int r1 = r4.readUnsignedShort()
            io.netty.handler.codec.dns.DnsRecordType r1 = io.netty.handler.codec.dns.DnsRecordType.valueOf(r1)
            int r4 = r4.readUnsignedShort()
            io.netty.handler.codec.dns.DefaultDnsQuestion r2 = new io.netty.handler.codec.dns.DefaultDnsQuestion
            r2.<init>(r0, r1, r4)
            return r2
    }

    @Override // io.netty.handler.codec.dns.DnsRecordDecoder
    public final <T extends io.netty.handler.codec.dns.DnsRecord> T decodeRecord(io.netty.buffer.ByteBuf r11) throws java.lang.Exception {
            r10 = this;
            int r0 = r11.readerIndex()
            java.lang.String r2 = decodeName(r11)
            int r1 = r11.writerIndex()
            int r3 = r1 - r0
            r4 = 10
            r5 = 0
            if (r3 >= r4) goto L17
            r11.readerIndex(r0)
            return r5
        L17:
            int r3 = r11.readUnsignedShort()
            io.netty.handler.codec.dns.DnsRecordType r3 = io.netty.handler.codec.dns.DnsRecordType.valueOf(r3)
            int r4 = r11.readUnsignedShort()
            r7 = r5
            long r5 = r11.readUnsignedInt()
            int r9 = r11.readUnsignedShort()
            int r8 = r11.readerIndex()
            int r1 = r1 - r8
            if (r1 >= r9) goto L37
            r11.readerIndex(r0)
            return r7
        L37:
            r1 = r10
            r7 = r11
            io.netty.handler.codec.dns.DnsRecord r11 = r1.decodeRecord(r2, r3, r4, r5, r7, r8, r9)
            int r8 = r8 + r9
            r7.readerIndex(r8)
            return r11
    }

    protected io.netty.handler.codec.dns.DnsRecord decodeRecord(java.lang.String r3, io.netty.handler.codec.dns.DnsRecordType r4, int r5, long r6, io.netty.buffer.ByteBuf r8, int r9, int r10) throws java.lang.Exception {
            r2 = this;
            io.netty.handler.codec.dns.DnsRecordType r0 = io.netty.handler.codec.dns.DnsRecordType.PTR
            if (r4 != r0) goto L1a
            r4 = r3
            r0 = r6
            io.netty.handler.codec.dns.DefaultDnsPtrRecord r3 = new io.netty.handler.codec.dns.DefaultDnsPtrRecord
            io.netty.buffer.ByteBuf r6 = r8.duplicate()
            int r10 = r10 + r9
            io.netty.buffer.ByteBuf r6 = r6.setIndex(r9, r10)
            java.lang.String r8 = r2.decodeName0(r6)
            r6 = r0
            r3.<init>(r4, r5, r6, r8)
            return r3
        L1a:
            r0 = r6
            r6 = r4
            r7 = r5
            r4 = r3
            io.netty.handler.codec.dns.DnsRecordType r3 = io.netty.handler.codec.dns.DnsRecordType.CNAME
            if (r6 == r3) goto L26
            io.netty.handler.codec.dns.DnsRecordType r3 = io.netty.handler.codec.dns.DnsRecordType.NS
            if (r6 != r3) goto L28
        L26:
            r5 = r4
            goto L39
        L28:
            r5 = r4
            io.netty.handler.codec.dns.DefaultDnsRawRecord r4 = new io.netty.handler.codec.dns.DefaultDnsRawRecord
            io.netty.buffer.ByteBuf r3 = r8.retainedDuplicate()
            int r10 = r10 + r9
            io.netty.buffer.ByteBuf r10 = r3.setIndex(r9, r10)
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r10)
            return r4
        L39:
            io.netty.handler.codec.dns.DefaultDnsRawRecord r4 = new io.netty.handler.codec.dns.DefaultDnsRawRecord
            io.netty.buffer.ByteBuf r3 = r8.duplicate()
            int r10 = r10 + r9
            io.netty.buffer.ByteBuf r3 = r3.setIndex(r9, r10)
            io.netty.buffer.ByteBuf r10 = io.netty.handler.codec.dns.DnsCodecUtil.decompressDomainName(r3)
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r10)
            return r4
    }
}
