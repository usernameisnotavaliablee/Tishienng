package io.netty.handler.codec.dns;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class DnsResponseDecoder<A extends java.net.SocketAddress> {
    private final io.netty.handler.codec.dns.DnsRecordDecoder recordDecoder;

    DnsResponseDecoder(io.netty.handler.codec.dns.DnsRecordDecoder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "recordDecoder"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.handler.codec.dns.DnsRecordDecoder r2 = (io.netty.handler.codec.dns.DnsRecordDecoder) r2
            r1.recordDecoder = r2
            return
    }

    private void decodeQuestions(io.netty.handler.codec.dns.DnsResponse r3, io.netty.buffer.ByteBuf r4, int r5) throws java.lang.Exception {
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

    private void decodeRecords(io.netty.handler.codec.dns.DnsResponse r2, io.netty.handler.codec.dns.DnsSection r3, io.netty.buffer.ByteBuf r4, int r5) throws java.lang.Exception {
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

    final io.netty.handler.codec.dns.DnsResponse decode(A r8, A r9, io.netty.buffer.ByteBuf r10) throws java.lang.Exception {
            r7 = this;
            int r4 = r10.readUnsignedShort()
            int r0 = r10.readUnsignedShort()
            int r1 = r0 >> 15
            if (r1 == 0) goto L80
            int r1 = r0 >> 11
            r1 = r1 & 15
            byte r1 = (byte) r1
            io.netty.handler.codec.dns.DnsOpCode r5 = io.netty.handler.codec.dns.DnsOpCode.valueOf(r1)
            r1 = r0 & 15
            byte r1 = (byte) r1
            io.netty.handler.codec.dns.DnsResponseCode r6 = io.netty.handler.codec.dns.DnsResponseCode.valueOf(r1)
            r1 = r7
            r2 = r8
            r3 = r9
            io.netty.handler.codec.dns.DnsResponse r8 = r1.newResponse(r2, r3, r4, r5, r6)
            int r9 = r0 >> 8
            r2 = 1
            r9 = r9 & r2
            r3 = 0
            if (r9 != r2) goto L2c
            r9 = 1
            goto L2d
        L2c:
            r9 = 0
        L2d:
            r8.setRecursionDesired(r9)
            int r9 = r0 >> 10
            r9 = r9 & r2
            if (r9 != r2) goto L37
            r9 = 1
            goto L38
        L37:
            r9 = 0
        L38:
            r8.setAuthoritativeAnswer(r9)
            int r9 = r0 >> 9
            r9 = r9 & r2
            if (r9 != r2) goto L42
            r9 = 1
            goto L43
        L42:
            r9 = 0
        L43:
            r8.setTruncated(r9)
            int r9 = r0 >> 7
            r9 = r9 & r2
            if (r9 != r2) goto L4c
            goto L4d
        L4c:
            r2 = 0
        L4d:
            r8.setRecursionAvailable(r2)
            int r9 = r0 >> 4
            r9 = r9 & 7
            r8.setZ(r9)
            int r9 = r10.readUnsignedShort()     // Catch: java.lang.Throwable -> L7a
            int r0 = r10.readUnsignedShort()     // Catch: java.lang.Throwable -> L7a
            int r2 = r10.readUnsignedShort()     // Catch: java.lang.Throwable -> L7a
            int r3 = r10.readUnsignedShort()     // Catch: java.lang.Throwable -> L7a
            r7.decodeQuestions(r8, r10, r9)     // Catch: java.lang.Throwable -> L7a
            io.netty.handler.codec.dns.DnsSection r9 = io.netty.handler.codec.dns.DnsSection.ANSWER     // Catch: java.lang.Throwable -> L7a
            r7.decodeRecords(r8, r9, r10, r0)     // Catch: java.lang.Throwable -> L7a
            io.netty.handler.codec.dns.DnsSection r9 = io.netty.handler.codec.dns.DnsSection.AUTHORITY     // Catch: java.lang.Throwable -> L7a
            r7.decodeRecords(r8, r9, r10, r2)     // Catch: java.lang.Throwable -> L7a
            io.netty.handler.codec.dns.DnsSection r9 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL     // Catch: java.lang.Throwable -> L7a
            r7.decodeRecords(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> L7a
            return r8
        L7a:
            r0 = move-exception
            r9 = r0
            r8.release()
            throw r9
        L80:
            r1 = r7
            io.netty.handler.codec.CorruptedFrameException r8 = new io.netty.handler.codec.CorruptedFrameException
            java.lang.String r9 = "not a response"
            r8.<init>(r9)
            throw r8
    }

    protected abstract io.netty.handler.codec.dns.DnsResponse newResponse(A r1, A r2, int r3, io.netty.handler.codec.dns.DnsOpCode r4, io.netty.handler.codec.dns.DnsResponseCode r5) throws java.lang.Exception;
}
