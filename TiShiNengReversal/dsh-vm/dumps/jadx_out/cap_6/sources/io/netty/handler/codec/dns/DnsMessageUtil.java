package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class DnsMessageUtil {
    private DnsMessageUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.StringBuilder appendAddresses(java.lang.StringBuilder r3, io.netty.handler.codec.dns.DnsMessage r4) {
            boolean r0 = r4 instanceof io.netty.channel.AddressedEnvelope
            if (r0 != 0) goto L5
            goto L2b
        L5:
            io.netty.channel.AddressedEnvelope r4 = (io.netty.channel.AddressedEnvelope) r4
            java.net.SocketAddress r0 = r4.sender()
            java.lang.String r1 = ", "
            if (r0 == 0) goto L1a
            java.lang.String r2 = "from: "
            r3.append(r2)
            r3.append(r0)
            r3.append(r1)
        L1a:
            java.net.SocketAddress r4 = r4.recipient()
            if (r4 == 0) goto L2b
            java.lang.String r0 = "to: "
            r3.append(r0)
            r3.append(r4)
            r3.append(r1)
        L2b:
            return r3
    }

    private static void appendAllRecords(java.lang.StringBuilder r1, io.netty.handler.codec.dns.DnsMessage r2) {
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.QUESTION
            appendRecords(r1, r2, r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ANSWER
            appendRecords(r1, r2, r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.AUTHORITY
            appendRecords(r1, r2, r0)
            io.netty.handler.codec.dns.DnsSection r0 = io.netty.handler.codec.dns.DnsSection.ADDITIONAL
            appendRecords(r1, r2, r0)
            return
    }

    static java.lang.StringBuilder appendQuery(java.lang.StringBuilder r0, io.netty.handler.codec.dns.DnsQuery r1) {
            appendQueryHeader(r0, r1)
            appendAllRecords(r0, r1)
            return r0
    }

    private static void appendQueryHeader(java.lang.StringBuilder r2, io.netty.handler.codec.dns.DnsQuery r3) {
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r2.append(r0)
            r0 = 40
            r2.append(r0)
            java.lang.StringBuilder r0 = appendAddresses(r2, r3)
            int r1 = r3.id()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            io.netty.handler.codec.dns.DnsOpCode r1 = r3.opCode()
            r0.append(r1)
            boolean r0 = r3.isRecursionDesired()
            if (r0 == 0) goto L2e
            java.lang.String r0 = ", RD"
            r2.append(r0)
        L2e:
            int r0 = r3.z()
            if (r0 == 0) goto L40
            java.lang.String r0 = ", Z: "
            r2.append(r0)
            int r3 = r3.z()
            r2.append(r3)
        L40:
            r3 = 41
            r2.append(r3)
            return
    }

    static java.lang.StringBuilder appendRecordClass(java.lang.StringBuilder r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r0 = 1
            if (r2 == r0) goto L29
            r0 = 2
            if (r2 == r0) goto L26
            r0 = 3
            if (r2 == r0) goto L23
            r0 = 4
            if (r2 == r0) goto L20
            r0 = 254(0xfe, float:3.56E-43)
            if (r2 == r0) goto L1d
            r0 = 255(0xff, float:3.57E-43)
            if (r2 == r0) goto L1a
            r0 = 0
            goto L2b
        L1a:
            java.lang.String r0 = "ANY"
            goto L2b
        L1d:
            java.lang.String r0 = "NONE"
            goto L2b
        L20:
            java.lang.String r0 = "HESIOD"
            goto L2b
        L23:
            java.lang.String r0 = "CHAOS"
            goto L2b
        L26:
            java.lang.String r0 = "CSNET"
            goto L2b
        L29:
            java.lang.String r0 = "IN"
        L2b:
            if (r0 == 0) goto L31
            r1.append(r0)
            return r1
        L31:
            java.lang.String r0 = "UNKNOWN("
            r1.append(r0)
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            return r1
    }

    private static void appendRecords(java.lang.StringBuilder r3, io.netty.handler.codec.dns.DnsMessage r4, io.netty.handler.codec.dns.DnsSection r5) {
            int r0 = r4.count(r5)
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.String r2 = io.netty.util.internal.StringUtil.NEWLINE
            r3.append(r2)
            r2 = 9
            r3.append(r2)
            io.netty.handler.codec.dns.DnsRecord r2 = r4.recordAt(r5, r1)
            r3.append(r2)
            int r1 = r1 + 1
            goto L5
        L1b:
            return
    }

    static java.lang.StringBuilder appendResponse(java.lang.StringBuilder r0, io.netty.handler.codec.dns.DnsResponse r1) {
            appendResponseHeader(r0, r1)
            appendAllRecords(r0, r1)
            return r0
    }

    private static void appendResponseHeader(java.lang.StringBuilder r5, io.netty.handler.codec.dns.DnsResponse r6) {
            java.lang.String r0 = io.netty.util.internal.StringUtil.simpleClassName(r6)
            r5.append(r0)
            r0 = 40
            r5.append(r0)
            java.lang.StringBuilder r0 = appendAddresses(r5, r6)
            int r1 = r6.id()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            io.netty.handler.codec.dns.DnsOpCode r2 = r6.opCode()
            r0.append(r2)
            r0.append(r1)
            io.netty.handler.codec.dns.DnsResponseCode r1 = r6.code()
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            boolean r0 = r6.isRecursionDesired()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L41
            java.lang.String r0 = " RD"
            r5.append(r0)
            r0 = 0
            goto L42
        L41:
            r0 = 1
        L42:
            boolean r4 = r6.isAuthoritativeAnswer()
            if (r4 == 0) goto L4e
            java.lang.String r0 = " AA"
            r5.append(r0)
            r0 = 0
        L4e:
            boolean r4 = r6.isTruncated()
            if (r4 == 0) goto L5a
            java.lang.String r0 = " TC"
            r5.append(r0)
            r0 = 0
        L5a:
            boolean r4 = r6.isRecursionAvailable()
            if (r4 == 0) goto L66
            java.lang.String r0 = " RA"
            r5.append(r0)
            goto L67
        L66:
            r2 = r0
        L67:
            int r0 = r6.z()
            if (r0 == 0) goto L7e
            if (r2 != 0) goto L72
            r5.append(r1)
        L72:
            java.lang.String r0 = " Z: "
            r5.append(r0)
            int r6 = r6.z()
            r5.append(r6)
        L7e:
            r6 = 41
            if (r2 == 0) goto L8b
            int r0 = r5.length()
            int r0 = r0 - r3
            r5.setCharAt(r0, r6)
            return
        L8b:
            r5.append(r6)
            return
    }
}
