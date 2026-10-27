package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DnsQueryEncoder {
    private final io.netty.handler.codec.dns.DnsRecordEncoder recordEncoder;

    DnsQueryEncoder(io.netty.handler.codec.dns.DnsRecordEncoder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "recordEncoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsRecordEncoder r2 = (io.netty.handler.codec.dns.DnsRecordEncoder) r2
            r1.recordEncoder = r2
            return
    }

    private static void encodeHeader(io.netty.handler.codec.dns.DnsQuery r2, io.netty.buffer.ByteBuf r3) {
            int r0 = r2.id()
            r3.writeShort(r0)
            io.netty.handler.codec.dns.DnsOpCode r0 = r2.opCode()
            byte r0 = r0.byteValue()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 14
            boolean r1 = r2.isRecursionDesired()
            if (r1 == 0) goto L1b
            r0 = r0 | 256(0x100, float:3.59E-43)
        L1b:
            r3.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            int r0 = r2.count(r0)
            r3.writeShort(r0)
            r0 = 0
            r3.writeShort(r0)
            r3.writeShort(r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            int r2 = r2.count(r0)
            r3.writeShort(r2)
            return
    }

    private void encodeQuestions(io.netty.handler.codec.dns.DnsQuery r5, io.netty.buffer.ByteBuf r6) throws java.lang.Exception {
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

    private void encodeRecords(io.netty.handler.codec.dns.DnsQuery r5, io.netty.handler.codec.dns.DnsSection r6, io.netty.buffer.ByteBuf r7) throws java.lang.Exception {
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

    void encode(io.netty.handler.codec.dns.DnsQuery r2, io.netty.buffer.ByteBuf r3) throws java.lang.Exception {
            r1 = this;
            encodeHeader(r2, r3)
            r1.encodeQuestions(r2, r3)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            r1.encodeRecords(r2, r0, r3)
            return
    }
}
