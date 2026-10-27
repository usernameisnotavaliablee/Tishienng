package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DefaultDnsOptEcsRecord extends io.netty.handler.codec.dns.AbstractDnsOptPseudoRrRecord implements io.netty.handler.codec.dns.DnsOptEcsRecord {
    private final byte[] address;
    private final int srcPrefixLength;

    public DefaultDnsOptEcsRecord(int r1, int r2, int r3, int r4, byte[] r5) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.srcPrefixLength = r4
            byte[] r1 = verifyAddress(r5)
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            r0.address = r1
            return
    }

    public DefaultDnsOptEcsRecord(int r7, int r8, byte[] r9) {
            r6 = this;
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public DefaultDnsOptEcsRecord(int r7, io.netty.channel.socket.InternetProtocolFamily r8) {
            r6 = this;
            java.net.InetAddress r8 = r8.localhost()
            byte[] r5 = r8.getAddress()
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private static byte[] verifyAddress(byte[] r2) {
            int r0 = r2.length
            r1 = 4
            if (r0 == r1) goto L12
            int r0 = r2.length
            r1 = 16
            if (r0 != r1) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bytes.length must either 4 or 16"
            r2.<init>(r0)
            throw r2
        L12:
            return r2
    }

    @Override // io.netty.handler.codec.dns.DnsOptEcsRecord
    public byte[] address() {
            r1 = this;
            byte[] r0 = r1.address
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsOptEcsRecord
    public int scopePrefixLength() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsOptEcsRecord
    public int sourcePrefixLength() {
            r1 = this;
            int r0 = r1.srcPrefixLength
            return r0
    }

    @Override // io.netty.handler.codec.dns.AbstractDnsOptPseudoRrRecord, io.netty.handler.codec.dns.AbstractDnsRecord
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.toStringBuilder()
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
            java.lang.String r1 = " address:"
            r0.append(r1)
            byte[] r1 = r2.address
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " sourcePrefixLength:"
            r0.append(r1)
            int r1 = r2.sourcePrefixLength()
            r0.append(r1)
            java.lang.String r1 = " scopePrefixLength:"
            r0.append(r1)
            int r1 = r2.scopePrefixLength()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
