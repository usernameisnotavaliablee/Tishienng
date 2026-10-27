package io.netty.handler.codec.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractDnsRecord implements io.netty.handler.codec.dns.DnsRecord {
    private final short dnsClass;
    private int hashCode;
    private final java.lang.String name;
    private final long timeToLive;
    private final io.netty.handler.codec.dns.DnsRecordType type;

    protected AbstractDnsRecord(java.lang.String r2, io.netty.handler.codec.dns.DnsRecordType r3, int r4, long r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "timeToLive"
            io.netty.util.internal.ObjectUtil.checkPositiveOrZero(r5, r0)
            java.lang.String r0 = "name"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = java.net.IDN.toASCII(r2)
            java.lang.String r2 = appendTrailingDot(r2)
            r1.name = r2
            java.lang.String r2 = "type"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r2)
            io.netty.handler.codec.dns.DnsRecordType r2 = (io.netty.handler.codec.dns.DnsRecordType) r2
            r1.type = r2
            short r2 = (short) r4
            r1.dnsClass = r2
            r1.timeToLive = r5
            return
    }

    protected AbstractDnsRecord(java.lang.String r7, io.netty.handler.codec.dns.DnsRecordType r8, long r9) {
            r6 = this;
            r3 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private static java.lang.String appendTrailingDot(java.lang.String r2) {
            int r0 = r2.length()
            if (r0 <= 0) goto L23
            int r0 = r2.length()
            int r0 = r0 + (-1)
            char r0 = r2.charAt(r0)
            r1 = 46
            if (r0 == r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
        L23:
            return r2
    }

    @Override // io.netty.handler.codec.dns.DnsRecord
    public int dnsClass() {
            r2 = this;
            short r0 = r2.dnsClass
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof io.netty.handler.codec.dns.DnsRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.handler.codec.dns.DnsRecord r5 = (io.netty.handler.codec.dns.DnsRecord) r5
            int r1 = r4.hashCode
            if (r1 == 0) goto L17
            int r3 = r5.hashCode()
            if (r1 == r3) goto L17
            return r2
        L17:
            io.netty.handler.codec.dns.DnsRecordType r1 = r4.type()
            int r1 = r1.intValue()
            io.netty.handler.codec.dns.DnsRecordType r3 = r5.type()
            int r3 = r3.intValue()
            if (r1 != r3) goto L42
            int r1 = r4.dnsClass()
            int r3 = r5.dnsClass()
            if (r1 != r3) goto L42
            java.lang.String r1 = r4.name()
            java.lang.String r5 = r5.name()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L42
            return r0
        L42:
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.hashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            io.netty.handler.codec.dns.DnsRecordType r1 = r2.type()
            int r1 = r1.intValue()
            int r1 = r1 * 31
            int r0 = r0 + r1
            int r1 = r2.dnsClass()
            int r0 = r0 + r1
            r2.hashCode = r0
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRecord
    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRecord
    public long timeToLive() {
            r2 = this;
            long r0 = r2.timeToLive
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.String r1 = r4.name()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            long r2 = r4.timeToLive()
            r0.append(r2)
            r0.append(r1)
            int r2 = r4.dnsClass()
            java.lang.StringBuilder r2 = io.netty.handler.codec.dns.DnsMessageUtil.appendRecordClass(r0, r2)
            r2.append(r1)
            io.netty.handler.codec.dns.DnsRecordType r1 = r4.type()
            java.lang.String r1 = r1.name()
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // io.netty.handler.codec.dns.DnsRecord
    public io.netty.handler.codec.dns.DnsRecordType type() {
            r1 = this;
            io.netty.handler.codec.dns.DnsRecordType r0 = r1.type
            return r0
    }
}
